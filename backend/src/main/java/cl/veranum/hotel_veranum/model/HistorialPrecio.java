package cl.veranum.hotel_veranum.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "historial_precios")
public class HistorialPrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;

    private Double precio;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Getters y Setters
}
