package org.example.factiuradorservicio.Controllers;
import org.example.factiuradorservicio.services.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.factiuradorservicio.repository.TipoPagoRepository;
import org.example.factiuradorservicio.classw.TipoPago;


import java.util.List;

@RestController
@RequestMapping("/tipos-pago")
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;

    @GetMapping
    public List<TipoPago> getAll() {
        return tipoPagoService.findAll();
    }

    @GetMapping("/{id}")
    public TipoPago getById(@PathVariable int id) {
        return tipoPagoService.findById(id);
    }

    @PostMapping
    public TipoPago create(@RequestBody TipoPago tipoPago) {
        return tipoPagoService.save(tipoPago);
    }

    @PutMapping("/{id}")
    public TipoPago update(@PathVariable int id, @RequestBody TipoPago tipoPago) {
        tipoPago.setIdTipoPago(id);
        return tipoPagoService.save(tipoPago);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        tipoPagoService.deleteById(id);
    }
}