package org.poloit.hsckstech.repository;

import org.poloit.hsckstech.entity.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {

    @Query("select a from Alumno a where a.alumnoId <> :alumnoId")
    Page<Alumno> findAllCustom(long alumnoId, Pageable page);
}
