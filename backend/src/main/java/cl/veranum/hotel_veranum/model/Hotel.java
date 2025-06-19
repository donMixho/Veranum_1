package cl.veranum.hotel_veranum.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "hoteles")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private String direccion;

    // Servicios extra: gimnasio, piscina, etc.
    private Boolean gimnasio;
    private Boolean piscina;
    private Boolean spa;
    private Boolean lavanderia;

    @OneToMany(mappedBy = "hotel")
    private List<Habitacion> habitaciones;

    // Getters y Setters
}

