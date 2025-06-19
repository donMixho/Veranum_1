package cl.veranum.hotel_veranum.controller;



import cl.veranum.hotel_veranum.model.Evento;
import cl.veranum.hotel_veranum.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> listar() {
        return eventoService.listarEventos();
    }

    @GetMapping("/{id}")
    public Evento obtenerPorId(@PathVariable Long id) {
        return eventoService.obtenerPorId(id);
    }

    @PostMapping
    public Evento crear(@RequestBody Evento evento) {
        return eventoService.crearEvento(evento);
    }

    @GetMapping("/hotel/{hotelId}")
    public List<Evento> listarPorHotel(@PathVariable Long hotelId) {
        return eventoService.listarEventosPorHotel(hotelId);
    }
}
