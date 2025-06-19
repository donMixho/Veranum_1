package cl.veranum.hotel_veranum.controller;


import cl.veranum.hotel_veranum.model.Reserva;
import cl.veranum.hotel_veranum.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva crear(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva> listar() {
        return reservaService.listarReservas();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Reserva> listarPorUsuario(@PathVariable Long usuarioId) {
        return reservaService.listarReservasPorUsuario(usuarioId);
    }

    @GetMapping("/{id}")
    public Reserva obtenerPorId(@PathVariable Long id) {
        return reservaService.obtenerPorId(id);
    }

    @PutMapping("/{id}/cancelar")
    public void cancelar(@PathVariable Long id) {
        reservaService.cancelarReserva(id);
    }

    @GetMapping("/validar")
    public boolean validarDisponibilidad(
            @RequestParam Long habitacionId,
            @RequestParam String fechaInicio,
            @RequestParam String fechaFin) {
        return reservaService.validarDisponibilidad(habitacionId, fechaInicio, fechaFin);
    }
}
