package org.example.factiuradorservicio.services;
import org.example.factiuradorservicio.classw.Clasificacion;
import org.example.factiuradorservicio.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public List<Clasificacion> findAll() {
        return clasificacionRepository.findAll();
    }

    public Clasificacion findById(int id) {
        return clasificacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clasificacion no encontrada con ID: " + id));
    }

    public Clasificacion save(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    public void deleteById(int id) {
        if (!clasificacionRepository.existsById(id)) {
            throw new RuntimeException("Clasificacion no encontrada con ID: " + id);
        }
        clasificacionRepository.deleteById(id);
    }
}