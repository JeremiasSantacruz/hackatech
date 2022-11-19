package org.poloit.hsckstech.service;

import lombok.AllArgsConstructor;
import org.poloit.hsckstech.dtos.AlumnoDto;
import org.poloit.hsckstech.entity.Alumno;
import org.poloit.hsckstech.mapper.AlumnoMapper;
import org.poloit.hsckstech.repository.AlumnoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AlumnoService {

    private AlumnoRepository repository;

    private AlumnoMapper mapper;

    public AlumnoDto givePoint(Long alumnoId){
        Optional<Alumno> alumnoOpt = repository.findById(alumnoId);
        Alumno alumno = alumnoOpt.get();
        int puntaje = alumno.getPuntaje() + 100;
        alumno.setPuntaje(puntaje);
        return mapper.toDto(repository.save(alumno));
    }

    public Page<AlumnoDto> getAlumno(Long alumnoId, Pageable page){
        Page<Alumno> alumnoPage = repository.findAllCustom(alumnoId, page);
        return alumnoPage.map(mapper::toDto);
    }

}
