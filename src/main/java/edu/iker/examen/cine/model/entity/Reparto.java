package edu.iker.examen.cine.model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name= "reparto")

public class Reparto {

    @Id 
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (nullable= false, length= 100)
    private String personaje;

    @Column 
    private double salario;

    @OneToMany (mappedBy ="reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pelicula> peliculas = new ArrayList<>();

    public Reparto() {
    }

    public Reparto(String personaje, double salario) {
        this.personaje = personaje;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    


    


    

    
    
}
