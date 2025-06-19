package cl.veranum.hotel_veranum.controller;



import cl.veranum.hotel_veranum.model.Habitacion;
import cl.veranum.hotel_veranum.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionController {
    @Autowired
    private HabitacionService habitacionService;

    @GetMapping
    public List<Habitacion> listar() {
        return habitacionService.listarHabitaciones();
    }

    @GetMapping("/{id}")
    public Habitacion obtenerPorId(@PathVariable Long id) {
        return habitacionService.obtenerPorId(id);
    }

    @GetMapping("/disponibles")
    public List<Habitacion> buscarDisponibles(
            @RequestParam String tipo,
            @RequestParam LocalDate fechaInicio,
            @RequestParam LocalDate fechaFin) {
        return habitacionService.buscarDisponibles(tipo, fechaInicio, fechaFin);
    }
}

