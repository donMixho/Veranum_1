package cl.veranum.hotel_veranum.model;

import jakarta.persistence.*;
@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String contacto;
    private String email;

    // Getters y Setters
}
