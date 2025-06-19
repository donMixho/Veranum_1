package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Reserva;

import java.time.LocalDate;
import java.util.List;

public interface ReservaService {
    Reserva crearReserva(Reserva reserva);
    List<Reserva> listarReservas();
    List<Reserva> listarReservasPorUsuario(Long usuarioId);
    Reserva obtenerPorId(Long id);
    Reserva actualizarReserva(Reserva reserva);
    void cancelarReserva(Long id);
    boolean validarDisponibilidad(Long habitacionId, String fechaInicio, String fechaFin);
}

