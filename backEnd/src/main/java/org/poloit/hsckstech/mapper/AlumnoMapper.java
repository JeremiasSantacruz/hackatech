package org.poloit.hsckstech.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.poloit.hsckstech.dtos.AlumnoDto;
import org.poloit.hsckstech.entity.Alumno;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AlumnoMapper {

    AlumnoDto toDto(Alumno entity);

    AlumnoDto toEntity(Alumno entity);

    Alumno merger(AlumnoDto dto, @MappingTarget Alumno entity);

}
