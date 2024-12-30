package org.example.factiuradorservicio.services;
import org.example.factiuradorservicio.classw.TipoPago;
import org.example.factiuradorservicio.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    public TipoPago findById(int id) {
        return tipoPagoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TipoPago no encontrado con ID: " + id));
    }

    public TipoPago save(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    public void deleteById(int id) {
        if (!tipoPagoRepository.existsById(id)) {
            throw new RuntimeException("TipoPago no encontrado con ID: " + id);
        }
        tipoPagoRepository.deleteById(id);
    }
}