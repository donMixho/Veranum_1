package cl.veranum.hotel_veranum.repository;

import cl.veranum.hotel_veranum.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {

    // Método personalizado para buscar habitaciones disponibles según el tipo y las fechas
    @Query("SELECT h FROM Habitacion h WHERE h.tipo = :tipo AND h.id NOT IN (" +
            "SELECT r.habitacion.id FROM Reserva r WHERE " +
            "r.fechaCheckOut > :fechaInicio AND r.fechaCheckIn < :fechaFin" +
            ")")
    List<Habitacion> buscarDisponibles(
            @Param("tipo") String tipo,
            @Param("fechaInicio") LocalDate fechaInicio,
            @Param("fechaFin") LocalDate fechaFin
    );
}
