package cl.veranum.hotel_veranum.service.impl;


import cl.veranum.hotel_veranum.model.Hotel;
import cl.veranum.hotel_veranum.repository.HotelRepository;
import cl.veranum.hotel_veranum.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> listarHoteles() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel obtenerPorId(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel actualizarHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void eliminarHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
