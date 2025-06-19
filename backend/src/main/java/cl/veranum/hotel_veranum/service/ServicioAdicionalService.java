package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.ServicioAdicional;
import java.util.List;

public interface ServicioAdicionalService {
    ServicioAdicional crearServicio(ServicioAdicional servicio);
    ServicioAdicional actualizarServicio(ServicioAdicional servicio);
    void eliminarServicio(Long id);
    List<ServicioAdicional> listarServicios();
    ServicioAdicional obtenerPorId(Long id);
}

