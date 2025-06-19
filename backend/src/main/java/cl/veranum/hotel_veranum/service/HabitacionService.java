package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Habitacion;

import java.time.LocalDate;
import java.util.List;

public interface HabitacionService {
    List<Habitacion> listarHabitaciones();
    Habitacion obtenerPorId(Long id);

    List<Habitacion> buscarDisponibles(String tipo, LocalDate fechaInicio, LocalDate fechaFin);

    Habitacion crearHabitacion(Habitacion habitacion);
    Habitacion actualizarHabitacion(Habitacion habitacion);
    void eliminarHabitacion(Long id);
}
