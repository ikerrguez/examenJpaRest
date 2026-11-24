package edu.iker.examen.cine.model.service;

import edu.iker.examen.cine.model.dto.PeliculaRequestDTO;
import edu.iker.examen.cine.model.entity.Pelicula;

public interface IPeliculaService {
    PeliculaRequestDTO listarTodos();
    PeliculaRequestDTO buscarPorId(Long id);
    PeliculaRequestDTO guardar(Pelicula pelicula);
    void eliminar(Long id);
    

}
