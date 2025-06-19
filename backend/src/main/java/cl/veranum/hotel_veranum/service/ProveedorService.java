package cl.veranum.hotel_veranum.service;

import cl.veranum.hotel_veranum.model.Proveedor;
import java.util.List;

public interface ProveedorService {
    Proveedor crearProveedor(Proveedor proveedor);
    Proveedor actualizarProveedor(Proveedor proveedor);
    void eliminarProveedor(Long id);
    List<Proveedor> listarProveedores();
    Proveedor obtenerPorId(Long id);
}
