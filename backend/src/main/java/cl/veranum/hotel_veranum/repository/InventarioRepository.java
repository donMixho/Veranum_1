package cl.veranum.hotel_veranum.repository;


import cl.veranum.hotel_veranum.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    List<Inventario> findByHotelId(Long hotelId);
}
