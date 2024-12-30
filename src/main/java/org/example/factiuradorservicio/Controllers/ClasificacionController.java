package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.repository.ClasificacionRepository;
import org.example.factiuradorservicio.classw.Clasificacion;
import org.example.factiuradorservicio.services.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clasificaciones")
public class ClasificacionController {

    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping
    public List<Clasificacion> getAll() {
        return clasificacionService.findAll();
    }

    @GetMapping("/{id}")
    public Clasificacion getById(@PathVariable int id) {
        return clasificacionService.findById(id);
    }

    @PostMapping
    public Clasificacion create(@RequestBody Clasificacion clasificacion) {
        return clasificacionService.save(clasificacion);
    }

    @PutMapping("/{id}")
    public Clasificacion update(@PathVariable int id, @RequestBody Clasificacion clasificacion) {
        clasificacion.setIdClasificacion(id);
        return clasificacionService.save(clasificacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        clasificacionService.deleteById(id);
    }
}