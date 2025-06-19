package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Inventario;
import java.util.List;

public interface InventarioService {
    Inventario crearInsumo(Inventario inventario);
    Inventario actualizarInsumo(Inventario inventario);
    void eliminarInsumo(Long id);
    List<Inventario> listarInventarioPorHotel(Long hotelId);
    Inventario obtenerPorId(Long id);
}

