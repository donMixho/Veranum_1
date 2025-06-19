package cl.veranum.hotel_veranum.exception;


public class BadRequestException extends RuntimeException {
    public BadRequestException(String mensaje) {
        super(mensaje);
    }
}

