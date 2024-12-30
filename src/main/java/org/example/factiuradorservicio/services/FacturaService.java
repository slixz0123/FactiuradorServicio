package org.example.factiuradorservicio.services;

import org.example.factiuradorservicio.classw.Factura;
import org.example.factiuradorservicio.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    public Factura findById(int id) {
        return facturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Factura no encontrada con ID: " + id));
    }

    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void deleteById(int id) {
        if (!facturaRepository.existsById(id)) {
            throw new RuntimeException("Factura no encontrada con ID: " + id);
        }
        facturaRepository.deleteById(id);
    }
}