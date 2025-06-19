package cl.veranum.hotel_veranum.repository;


import cl.veranum.hotel_veranum.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
