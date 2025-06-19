package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.ServicioAdicional;
import cl.veranum.hotel_veranum.repository.ServicioAdicionalRepository;
import cl.veranum.hotel_veranum.service.ServicioAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicioAdicionalServiceImpl implements ServicioAdicionalService {

    @Autowired
    private ServicioAdicionalRepository servicioAdicionalRepository;

    @Override
    public ServicioAdicional crearServicio(ServicioAdicional servicio) {
        return servicioAdicionalRepository.save(servicio);
    }

    @Override
    public ServicioAdicional actualizarServicio(ServicioAdicional servicio) {
        return servicioAdicionalRepository.save(servicio);
    }

    @Override
    public void eliminarServicio(Long id) {
        servicioAdicionalRepository.deleteById(id);
    }

    @Override
    public List<ServicioAdicional> listarServicios() {
        return servicioAdicionalRepository.findAll();
    }

    @Override
    public ServicioAdicional obtenerPorId(Long id) {
        return servicioAdicionalRepository.findById(id).orElse(null);
    }
}
