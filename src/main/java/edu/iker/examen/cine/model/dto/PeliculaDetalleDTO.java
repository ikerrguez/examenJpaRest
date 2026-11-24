package edu.iker.examen.cine.model.dto;

import java.util.List;

public record PeliculaDetalleDTO(
    Long id, 
    String titulo, 
    String director, 
    int anio, 
    int duracion,
    List<RepartoDTO> reparto
) {

}
