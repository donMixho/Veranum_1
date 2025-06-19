package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Hotel;
import java.util.List;

public interface HotelService {
    List<Hotel> listarHoteles();
    Hotel obtenerPorId(Long id);
    Hotel crearHotel(Hotel hotel);
    Hotel actualizarHotel(Hotel hotel);
    void eliminarHotel(Long id);
}
