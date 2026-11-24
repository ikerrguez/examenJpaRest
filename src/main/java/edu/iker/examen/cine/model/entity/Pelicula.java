package edu.iker.examen.cine.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "peliculas")

public class Pelicula {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column (name= "pelicula")
    private Long id;

    @Column (nullable= false, unique = true, length=150)
    private String titulo;

    @Column (nullable= false, length=100)
    private String director;

    @Column 
    private int anio;

    @Column 
    private int duracion; 

    


}
