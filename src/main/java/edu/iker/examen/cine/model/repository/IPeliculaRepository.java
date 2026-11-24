package edu.iker.examen.cine.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examen.cine.model.entity.Pelicula;

public interface IPeliculaRepository extends JpaRepository <Pelicula, Long> {

}
