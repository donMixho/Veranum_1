package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.HistorialPrecio;
import java.util.List;

public interface HistorialPrecioService {
    HistorialPrecio agregarHistorial(HistorialPrecio historial);
    List<HistorialPrecio> listarPorHabitacion(Long habitacionId);
}
