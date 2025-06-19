package cl.veranum.hotel_veranum.exception;
import cl.veranum.hotel_veranum.dto.MensajeRespuestaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<MensajeRespuestaDto> resourceNotFound(ResourceNotFoundException ex) {
        MensajeRespuestaDto respuesta = new MensajeRespuestaDto(ex.getMessage());
        return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<MensajeRespuestaDto> badRequest(BadRequestException ex) {
        MensajeRespuestaDto respuesta = new MensajeRespuestaDto(ex.getMessage());
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MensajeRespuestaDto> exceptionGenerica(Exception ex) {
        MensajeRespuestaDto respuesta = new MensajeRespuestaDto("Error interno del servidor: " + ex.getMessage());
        return new ResponseEntity<>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
