package cl.veranum.hotel_veranum.service.impl;
import cl.veranum.hotel_veranum.model.Reserva;
import cl.veranum.hotel_veranum.model.Habitacion;
import cl.veranum.hotel_veranum.model.Promocion;
import cl.veranum.hotel_veranum.repository.ReservaRepository;
import cl.veranum.hotel_veranum.repository.HabitacionRepository;
import cl.veranum.hotel_veranum.repository.PromocionRepository;
import cl.veranum.hotel_veranum.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Autowired
    private PromocionRepository promocionRepository;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        Habitacion habitacion = habitacionRepository.findById(reserva.getHabitacion().getId())
                .orElseThrow(() -> new RuntimeException("Habitación no encontrada"));
        reserva.setHabitacion(habitacion);

        long dias = ChronoUnit.DAYS.between(reserva.getFechaCheckIn(), reserva.getFechaCheckOut());
        if (dias <= 0) dias = 1;

        double total = dias * habitacion.getPrecioNoche();

        if (reserva.getPromocionAplicada() != null && reserva.getPromocionAplicada().getId() != null) {
            Promocion promo = promocionRepository.findById(reserva.getPromocionAplicada().getId()).orElse(null);
            if (promo != null && promo.getDescuento() != null) {
                total = total - (total * promo.getDescuento() / 100);
                reserva.setPromocionAplicada(promo);
            }
        }

        reserva.setTotal(total);

        return reservaRepository.save(reserva);
    }

    @Override
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public List<Reserva> listarReservasPorUsuario(Long usuarioId) {
        return reservaRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public Reserva obtenerPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void cancelarReserva(Long id) {
        reservaRepository.deleteById(id);
    }

    @Override
    public boolean validarDisponibilidad(Long habitacionId, String fechaInicio, String fechaFin) {
        // Esto depende de tu implementación. Aquí solo lo dejamos vacío.
        return true;
    }
}
