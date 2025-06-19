package cl.veranum.hotel_veranum.model;



import jakarta.persistence.*;

@Entity
@Table(name = "servicios_adicionales")
public class ServicioAdicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // Spa, Gimnasio, Lavandería, etc.
    private Double precioDia;

    // Getters y Setters
}
