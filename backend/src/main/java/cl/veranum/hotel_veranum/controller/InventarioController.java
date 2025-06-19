package cl.veranum.hotel_veranum.controller;

import cl.veranum.hotel_veranum.model.Inventario;
import cl.veranum.hotel_veranum.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping("/hotel/{hotelId}")
    public List<Inventario> listarPorHotel(@PathVariable Long hotelId) {
        return inventarioService.listarInventarioPorHotel(hotelId);
    }

    @GetMapping("/{id}")
    public Inventario obtenerPorId(@PathVariable Long id) {
        return inventarioService.obtenerPorId(id);
    }
}
