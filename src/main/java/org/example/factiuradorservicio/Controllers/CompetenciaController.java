package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.repository.CompetenciaRepository;
import org.example.factiuradorservicio.classw.Competencia;
import org.example.factiuradorservicio.services.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/competencias")
public class CompetenciaController {

    @Autowired
    private CompetenciaService competenciaService;

    @GetMapping
    public List<Competencia> getAll() {
        return competenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Competencia getById(@PathVariable int id) {
        return competenciaService.findById(id);
    }

    @PostMapping
    public Competencia create(@RequestBody Competencia competencia) {
        return competenciaService.save(competencia);
    }

    @PutMapping("/{id}")
    public Competencia update(@PathVariable int id, @RequestBody Competencia competencia) {
        competencia.setIdCompetencia(id);
        return competenciaService.save(competencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        competenciaService.deleteById(id);
    }
}