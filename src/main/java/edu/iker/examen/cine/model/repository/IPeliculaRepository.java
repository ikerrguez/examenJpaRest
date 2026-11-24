package edu.iker.examen.cine.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examen.cine.model.entity.Pelicula;
import java.util.List;


public interface IPeliculaRepository extends JpaRepository <Pelicula, Long> {
    boolean existsByTituloIgnoreCase(String titulo);

    List<Pelicula> findByAnioGreaterThanOrderByAnioAsc(Integer anio);
}
