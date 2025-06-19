package cl.veranum.hotel_veranum.controller;

import cl.veranum.hotel_veranum.model.Usuario;
import cl.veranum.hotel_veranum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar(@RequestBody Usuario usuario) {
        try {
            Usuario creado = userService.registrarUsuario(usuario);
            return ResponseEntity.ok(Map.of(
                    "mensaje", "Usuario registrado correctamente",
                    "usuario", creado
            ));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(Map.of("mensaje", e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("mensaje", "Error en el registro: " + e.getMessage()));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        return userService.login(usuario.getEmail(), usuario.getPassword())
                .map(user -> ResponseEntity.ok(user))
                .orElse(ResponseEntity.status(401).build()); // <--- sin body
    }





    @GetMapping
    public List<Usuario> listar() {
        return userService.listarUsuarios();
    }
}
