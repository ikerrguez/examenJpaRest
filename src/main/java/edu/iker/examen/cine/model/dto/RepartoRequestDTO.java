package edu.iker.examen.cine.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RepartoRequestDTO(
    @NotBlank (message= "Debe exisitir un id asociado a actor") Long actorId,
    @NotBlank (message= "El nombre del personaje es obligatorio") String personaje,
    @NotNull (message = "El salario es obligatorio") double salario

) {

}
