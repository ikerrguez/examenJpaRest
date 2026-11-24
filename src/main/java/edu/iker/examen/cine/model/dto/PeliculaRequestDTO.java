package edu.iker.examen.cine.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PeliculaRequestDTO(
    @NotBlank (message= "El titulo es obligatorio") String titulo,
    @NotBlank (message= "Debe existir director") String director,
    @NotNull (message= "El año es obligatorio") int anio,
    @NotNull (message= "Debe haber un mínimo de duración") int duracion
) {

}
