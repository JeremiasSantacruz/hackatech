package org.poloit.hsckstech.controller;

import lombok.AllArgsConstructor;
import org.poloit.hsckstech.dtos.AlumnoDto;
import org.poloit.hsckstech.service.AlumnoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
@AllArgsConstructor
public class AlumnoContoller {

    private AlumnoService service;

    @PutMapping("/{alumnoId}/point")
    public AlumnoDto givePoint(@PathVariable("alumnoId") Long alumnoId){
        return service.givePoint(alumnoId);
    }

    @GetMapping("/{alumnoId}")
    public Page<AlumnoDto> getAlumno(@PathVariable("alumnoId") Long alumnoId ,Pageable page){
        return service.getAlumno(alumnoId, page);
    }
}