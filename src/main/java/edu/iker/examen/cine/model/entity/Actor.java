package edu.iker.examen.cine.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name ="actor")

public class Actor {

    @Id 
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (nullable= false, length=100)
    private String nombre;

    @Column (nullable= false, length= 60)
    private String nacionalidad;

    @OneToMany (mappedBy= "actor", cascade= CascadeType.ALL, orphanRemoval= true)
    private Reparto reparto;

    public Actor() {
    }

    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }


    

    
    
}
