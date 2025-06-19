package cl.veranum.hotel_veranum.service;



import cl.veranum.hotel_veranum.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UserService {
    Usuario registrarUsuario(Usuario usuario);
    Optional<Usuario>login(String email, String password);
    List<Usuario> listarUsuarios();
    Usuario obtenerPorId(Long id);
    void eliminarUsuario(Long id);
    Usuario actualizarUsuario(Usuario usuario);
}
