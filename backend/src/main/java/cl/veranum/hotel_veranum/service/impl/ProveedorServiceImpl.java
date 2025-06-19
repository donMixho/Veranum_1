package cl.veranum.hotel_veranum.service.impl;

import cl.veranum.hotel_veranum.model.Proveedor;
import cl.veranum.hotel_veranum.repository.ProveedorRepository;
import cl.veranum.hotel_veranum.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Proveedor crearProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor actualizarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void eliminarProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor obtenerPorId(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }
}
