package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.services.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.factiuradorservicio.classw.Proveedores;


import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresService proveedoresService;

    @GetMapping
    public List<Proveedores> getAll() {
        return proveedoresService.findAll();
    }

    @GetMapping("/{id}")
    public Proveedores getById(@PathVariable int id) {
        return proveedoresService.findById(id);
    }

    @PostMapping
    public Proveedores create(@RequestBody Proveedores proveedor) {
        return proveedoresService.save(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedores update(@PathVariable int id, @RequestBody Proveedores proveedor) {
        proveedor.setIdProveedor(id);
        return proveedoresService.save(proveedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        proveedoresService.deleteById(id);
    }
}