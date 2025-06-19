package cl.veranum.hotel_veranum.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;

    @Column(nullable = false)
    private Double total;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocionAplicada; // Puede ser null

    // Estado: CONFIRMADA, PENDIENTE, CANCELADA
    private String estado;

    // Getters y Setters
}

