package cl.veranum.hotel_veranum.controller;

import cl.veranum.hotel_veranum.model.Promocion;
import cl.veranum.hotel_veranum.service.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/promociones")
public class PromocionController {
    @Autowired
    private PromocionService promocionService;

    @GetMapping("/activas")
    public List<Promocion> listarActivas() {
        return promocionService.listarPromocionesActivas();
    }

    @GetMapping("/{id}")
    public Promocion obtenerPorId(@PathVariable Long id) {
        return promocionService.obtenerPorId(id);
    }

    @PostMapping
    public Promocion crear(@RequestBody Promocion promocion) {
        return promocionService.crearPromocion(promocion);
    }

    @PutMapping("/{id}")
    public Promocion actualizar(@PathVariable Long id, @RequestBody Promocion promocion) {
        promocion.setId(id);
        return promocionService.actualizarPromocion(promocion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        promocionService.eliminarPromocion(id);
    }

    @GetMapping("/codigo/{codigo}")
    public Promocion buscarPorCodigo(@PathVariable String codigo) {
        return promocionService.buscarPorCodigo(codigo);
    }
}

