package cl.veranum.hotel_veranum.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreInsumo;
    private Integer stockActual;
    private String unidad; // Ej: kilos, litros, unidades

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    // Getters y Setters
}
