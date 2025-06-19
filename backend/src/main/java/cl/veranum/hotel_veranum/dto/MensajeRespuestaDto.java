package cl.veranum.hotel_veranum.dto;


public class MensajeRespuestaDto {
    private String mensaje;

    public MensajeRespuestaDto() {}
    public MensajeRespuestaDto(String mensaje) { this.mensaje = mensaje; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
