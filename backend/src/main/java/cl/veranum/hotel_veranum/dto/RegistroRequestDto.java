package cl.veranum.hotel_veranum.dto;


public class RegistroRequestDto {
    private String nombreCompleto;
    private String email;
    private String password;

    public RegistroRequestDto() {}

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
