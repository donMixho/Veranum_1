package cl.veranum.hotel_veranum.service.impl;
import cl.veranum.hotel_veranum.model.Habitacion;
import cl.veranum.hotel_veranum.repository.HabitacionRepository;
import cl.veranum.hotel_veranum.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public List<Habitacion> listarHabitaciones() {
        return habitacionRepository.findAll();
    }

    @Override
    public Habitacion obtenerPorId(Long id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Habitacion> buscarDisponibles(String tipo, LocalDate fechaInicio, LocalDate fechaFin) {
        return habitacionRepository.buscarDisponibles(tipo, fechaInicio, fechaFin);
    }
    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

    @Override
    public Habitacion actualizarHabitacion(Habitacion habitacion) {
        return habitacionRepository.save(habitacion);
    }

    @Override
    public void eliminarHabitacion(Long id) {
        habitacionRepository.deleteById(id);
    }
}
