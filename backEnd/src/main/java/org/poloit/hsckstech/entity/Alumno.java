package org.poloit.hsckstech.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Getter
@Setter
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "alumno_id", nullable = false)
    private Long alumnoId;

    @Size(max = 50)
    @Column(name = "ALU_NOMBRE")
    private String nombre;

    @Size(max = 50)
    @Column(name = "ALU_APELLIDO")
    private String apellido;

    @Size(max = 30)
    @Column(name = "ALU_EMAIL")
    private String email;

    @Size(max = 30)
    @Column(name = "ALU_ALIAS")
    private String alias;

    @Column(name = "ALU_PUNTAJE")
    private Integer puntaje;
}
