package cl.veranum.hotel_veranum.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    private LocalDate fechaEvento;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private Integer capacidad;

    // Getters y Setters
}
