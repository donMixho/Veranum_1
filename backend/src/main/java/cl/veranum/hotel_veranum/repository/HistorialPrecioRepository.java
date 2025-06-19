package cl.veranum.hotel_veranum.repository;


import cl.veranum.hotel_veranum.model.HistorialPrecio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistorialPrecioRepository extends JpaRepository<HistorialPrecio, Long> {
    List<HistorialPrecio> findByHabitacionId(Long habitacionId);
}
