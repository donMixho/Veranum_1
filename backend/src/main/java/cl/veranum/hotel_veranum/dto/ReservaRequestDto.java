package cl.veranum.hotel_veranum.dto;

import java.time.LocalDate;

public class ReservaRequestDto {
    private Long usuarioId;
    private Long habitacionId;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private String codigoPromocion; // opcional

    public ReservaRequestDto() {}

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getHabitacionId() { return habitacionId; }
    public void setHabitacionId(Long habitacionId) { this.habitacionId = habitacionId; }

    public LocalDate getFechaCheckIn() { return fechaCheckIn; }
    public void setFechaCheckIn(LocalDate fechaCheckIn) { this.fechaCheckIn = fechaCheckIn; }

    public LocalDate getFechaCheckOut() { return fechaCheckOut; }
    public void setFechaCheckOut(LocalDate fechaCheckOut) { this.fechaCheckOut = fechaCheckOut; }

    public String getCodigoPromocion() { return codigoPromocion; }
    public void setCodigoPromocion(String codigoPromocion) { this.codigoPromocion = codigoPromocion; }
}
