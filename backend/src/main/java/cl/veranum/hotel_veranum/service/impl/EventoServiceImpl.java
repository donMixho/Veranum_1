package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.Evento;
import cl.veranum.hotel_veranum.repository.EventoRepository;
import cl.veranum.hotel_veranum.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento obtenerPorId(Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public List<Evento> listarEventosPorHotel(Long hotelId) {
        return eventoRepository.findByHotelId(hotelId);
    }
}
