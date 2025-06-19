package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.Inventario;
import cl.veranum.hotel_veranum.repository.InventarioRepository;
import cl.veranum.hotel_veranum.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public Inventario crearInsumo(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public Inventario actualizarInsumo(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public void eliminarInsumo(Long id) {
        inventarioRepository.deleteById(id);
    }

    @Override
    public List<Inventario> listarInventarioPorHotel(Long hotelId) {
        return inventarioRepository.findByHotelId(hotelId);
    }

    @Override
    public Inventario obtenerPorId(Long id) {
        return inventarioRepository.findById(id).orElse(null);
    }
}
