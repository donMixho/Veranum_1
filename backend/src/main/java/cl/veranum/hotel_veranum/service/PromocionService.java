package cl.veranum.hotel_veranum.service;


import cl.veranum.hotel_veranum.model.Promocion;
import java.util.List;

public interface PromocionService {
    Promocion crearPromocion(Promocion promocion);
    Promocion actualizarPromocion(Promocion promocion);
    void eliminarPromocion(Long id);
    List<Promocion> listarPromocionesActivas();
    Promocion obtenerPorId(Long id);
    Promocion buscarPorCodigo(String codigo);
}

