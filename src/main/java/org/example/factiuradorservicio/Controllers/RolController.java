package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.factiuradorservicio.repository.RolRepository;
import org.example.factiuradorservicio.classw.Rol;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAll() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public Rol getById(@PathVariable int id) {
        return rolService.findById(id);
    }

    @PostMapping
    public Rol create(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @PutMapping("/{id}")
    public Rol update(@PathVariable int id, @RequestBody Rol rol) {
        rol.setIdRol(id);
        return rolService.save(rol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        rolService.deleteById(id);
    }
}