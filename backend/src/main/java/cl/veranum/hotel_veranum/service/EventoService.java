package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Evento;
import java.util.List;

public interface EventoService {
    List<Evento> listarEventos();
    Evento obtenerPorId(Long id);
    Evento crearEvento(Evento evento);
    List<Evento> listarEventosPorHotel(Long hotelId);
}
