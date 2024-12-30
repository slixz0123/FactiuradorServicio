package org.example.factiuradorservicio.Controllers;


import org.example.factiuradorservicio.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.factiuradorservicio.repository.ProductRepository;
import org.example.factiuradorservicio.classw.Producto;


import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto getById(@PathVariable int id) {
        return productoService.findById(id);
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable int id, @RequestBody Producto producto) {
        producto.setIdProducto(id);
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productoService.deleteById(id);
    }
}
