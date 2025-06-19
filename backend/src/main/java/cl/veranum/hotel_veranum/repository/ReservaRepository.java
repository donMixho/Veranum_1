package cl.veranum.hotel_veranum.repository;

import cl.veranum.hotel_veranum.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByUsuarioId(Long usuarioId);

    // Método personalizado para contar reservas superpuestas en fechas
    @Query("SELECT COUNT(r) FROM Reserva r WHERE r.habitacion.id = :habitacionId " +
            "AND r.fechaCheckOut > :fechaInicio " +
            "AND r.fechaCheckIn < :fechaFin")
    int countReservasEnFechas(
            @Param("habitacionId") Long habitacionId,
            @Param("fechaInicio") String fechaInicio,
            @Param("fechaFin") String fechaFin
    );
}
