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




    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int anio, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    } 

    

    


    
    


}
