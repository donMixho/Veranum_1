package cl.veranum.hotel_veranum.model;



import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo; // Premium, Suite, Doble, Familiar, etc.

    private String descripcion;

    @Column(nullable = false)
    private Integer capacidad; // Número de personas

    @Column(nullable = false)
    private Double precioNoche;

    @Column(nullable = false)
    private String estado; // DISPONIBLE, OCUPADA, MANTENCION

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    // Para historial de precios (ver abajo entidad HistorialPrecio)
    @OneToMany(mappedBy = "habitacion")
    private List<HistorialPrecio> historialPrecios;

    // Getters y Setters
}
