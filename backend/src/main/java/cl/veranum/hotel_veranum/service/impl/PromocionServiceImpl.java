package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.Promocion;
import cl.veranum.hotel_veranum.repository.PromocionRepository;
import cl.veranum.hotel_veranum.service.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromocionServiceImpl implements PromocionService {

    @Autowired
    private PromocionRepository promocionRepository;

    @Override
    public Promocion crearPromocion(Promocion promocion) {
        return promocionRepository.save(promocion);
    }

    @Override
    public Promocion actualizarPromocion(Promocion promocion) {
        return promocionRepository.save(promocion);
    }

    @Override
    public void eliminarPromocion(Long id) {
        promocionRepository.deleteById(id);
    }

    @Override
    public List<Promocion> listarPromocionesActivas() {
        return promocionRepository.findByActivaTrue();
    }

    @Override
    public Promocion obtenerPorId(Long id) {
        return promocionRepository.findById(id).orElse(null);
    }

    @Override
    public Promocion buscarPorCodigo(String codigo) {
        return promocionRepository.findByCodigo(codigo);
    }
}
