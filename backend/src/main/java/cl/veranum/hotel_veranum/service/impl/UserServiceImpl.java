package cl.veranum.hotel_veranum.service.impl;


import cl.veranum.hotel_veranum.model.Usuario;
import cl.veranum.hotel_veranum.repository.UserRepository;
import cl.veranum.hotel_veranum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        // Evita emails repetidos
        if (userRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("El email ya existe");
        }
        return userRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> login(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public Usuario obtenerPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }
}