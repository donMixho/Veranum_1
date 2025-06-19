package cl.veranum.hotel_veranum.controller;



import cl.veranum.hotel_veranum.model.HistorialPrecio;
import cl.veranum.hotel_veranum.service.HistorialPrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historial-precios")
public class HistorialPrecioController {
    @Autowired
    private HistorialPrecioService historialPrecioService;

    @GetMapping("/habitacion/{habitacionId}")
    public List<HistorialPrecio> listarPorHabitacion(@PathVariable Long habitacionId) {
        return historialPrecioService.listarPorHabitacion(habitacionId);
    }
}

