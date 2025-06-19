package cl.veranum.hotel_veranum.dto;


public class HabitacionSimpleDto {
    private Long id;
    private String tipo;
    private String descripcion;
    private Integer capacidad;
    private Double precioNoche;

    public HabitacionSimpleDto() {}

    // Getters y setters...

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }

    public Double getPrecioNoche() { return precioNoche; }
    public void setPrecioNoche(Double precioNoche) { this.precioNoche = precioNoche; }
}
