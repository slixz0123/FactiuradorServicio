package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.repository.PersonaRepository;
import org.example.factiuradorservicio.classw.Persona;
import org.example.factiuradorservicio.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable int id) {
        return personaService.findById(id);
    }

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable int id, @RequestBody Persona persona) {
        persona.setIdPersona(id);
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        personaService.deleteById(id);
    }
}