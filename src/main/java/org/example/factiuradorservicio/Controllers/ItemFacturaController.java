package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.repository.ItemFacturaRepository;
import org.example.factiuradorservicio.classw.ItemFactura;
import org.example.factiuradorservicio.services.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items-factura")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaService itemFacturaService;

    @GetMapping
    public List<ItemFactura> getAll() {
        return itemFacturaService.findAll();
    }

    @GetMapping("/{id}")
    public ItemFactura getById(@PathVariable int id) {
        return itemFacturaService.findById(id);
    }

    @PostMapping
    public ItemFactura create(@RequestBody ItemFactura itemFactura) {
        return itemFacturaService.save(itemFactura);
    }

    @PutMapping("/{id}")
    public ItemFactura update(@PathVariable int id, @RequestBody ItemFactura itemFactura) {
        itemFactura.setIdItemFactura(id);
        return itemFacturaService.save(itemFactura);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        itemFacturaService.deleteById(id);
    }
}