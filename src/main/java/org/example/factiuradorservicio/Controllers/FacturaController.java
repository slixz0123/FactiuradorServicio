package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.repository.FacturaRepository;
import org.example.factiuradorservicio.classw.Factura;
import org.example.factiuradorservicio.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> getAll() {
        return facturaService.findAll();
    }

    @GetMapping("/{id}")
    public Factura getById(@PathVariable int id) {
        return facturaService.findById(id);
    }

    @PostMapping
    public Factura create(@RequestBody Factura factura) {
        return facturaService.save(factura);
    }

    @PutMapping("/{id}")
    public Factura update(@PathVariable int id, @RequestBody Factura factura) {
        factura.setIdFactura(id);
        return facturaService.save(factura);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        facturaService.deleteById(id);
    }
}