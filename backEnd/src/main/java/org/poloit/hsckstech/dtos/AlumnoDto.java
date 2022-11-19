package org.poloit.hsckstech.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Builder
public class AlumnoDto implements Serializable {
    private final Long alumnoId;
    @Size(max = 50)
    private final String nombre;
    @Size(max = 30)
    private final String apellido;
    @Size(max = 30)
    private final String email;
    @Size(max = 30)
    private final String alias;
    @Size(max = 30)
    private final Integer puntaje;
}
