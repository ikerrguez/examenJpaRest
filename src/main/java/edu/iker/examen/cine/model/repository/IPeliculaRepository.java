package edu.iker.examen.cine.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examen.cine.model.entity.Pelicula;
import java.util.List;


public interface IPeliculaRepository extends JpaRepository <Pelicula, Long> {
    //Un método que indique si ya existe una película con un título dado, ignorando mayúsculas y minúsculas
    boolean existexistsByTitulo(String titulo);

    //Un método que devuelva las películas filmadas posteriormente al año que se pase, ordenadas por año de menor a mayor.
    List<Pelicula> findByAnioOrderByAsc(int anio);

}
