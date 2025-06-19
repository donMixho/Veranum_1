package cl.veranum.hotel_veranum.repository;


import cl.veranum.hotel_veranum.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findByHotelId(Long hotelId);
}
