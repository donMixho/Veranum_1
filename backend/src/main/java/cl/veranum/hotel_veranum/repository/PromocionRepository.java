package cl.veranum.hotel_veranum.repository;

import cl.veranum.hotel_veranum.model.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PromocionRepository extends JpaRepository<Promocion, Long> {
    List<Promocion> findByActivaTrue();
    Promocion findByCodigo(String codigo);
}
