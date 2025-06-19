package cl.veranum.hotel_veranum.controller;




import cl.veranum.hotel_veranum.model.ServicioAdicional;
import cl.veranum.hotel_veranum.service.ServicioAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class ServicioAdicionalController {
    @Autowired
    private ServicioAdicionalService servicioAdicionalService;

    @GetMapping
    public List<ServicioAdicional> listar() {
        return servicioAdicionalService.listarServicios();
    }

    @GetMapping("/{id}")
    public ServicioAdicional obtenerPorId(@PathVariable Long id) {
        return servicioAdicionalService.obtenerPorId(id);
    }
}
