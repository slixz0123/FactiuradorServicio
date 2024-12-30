package org.example.factiuradorservicio;


import org.example.factiuradorservicio.classw.Factura;
import org.example.factiuradorservicio.classw.ItemFactura;
import org.example.factiuradorservicio.repository.FacturaRepository;
import org.example.factiuradorservicio.repository.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear y guardar 10 facturas
        for (int i = 1; i <= 10; i++) {
            Factura factura = new Factura();
            factura.setIdPersona(i);
            factura.setFecha(new Date(System.currentTimeMillis()));
            factura.setIdTipoPago(i % 3 + 1); // Cicla entre 1, 2, 3
            factura.setDescuento(i * 0.05);
            factura.setTotal(100 + i * 50);

            // Crear 2 items por factura
            List<ItemFactura> items = new ArrayList<>();
            for (int j = 1; j <= 2; j++) {
                ItemFactura item = new ItemFactura();
                item.setIdProducto(j);
                item.setCantidad(j + i);
                item.setPrecio(50.0 + j * 10);
                item.setSubtotal(item.getCantidad() * item.getPrecio());
                item.setFactura(factura); // Asociar la factura
                items.add(item);
            }

            factura.setItems(items); // Asociar items a la factura

            // Guardar factura y sus items
            facturaRepository.save(factura);
        }

        System.out.println("Se han creado 10 registros en la tabla Factura y sus Items asociados.");
    }
}
