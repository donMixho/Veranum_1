package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.HistorialPrecio;
import cl.veranum.hotel_veranum.repository.HistorialPrecioRepository;
import cl.veranum.hotel_veranum.service.HistorialPrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HistorialPrecioServiceImpl implements HistorialPrecioService {

    @Autowired
    private HistorialPrecioRepository historialPrecioRepository;

    @Override
    public HistorialPrecio agregarHistorial(HistorialPrecio historial) {
        return historialPrecioRepository.save(historial);
    }

    @Override
    public List<HistorialPrecio> listarPorHabitacion(Long habitacionId) {
        return historialPrecioRepository.findByHabitacionId(habitacionId);
    }
}
