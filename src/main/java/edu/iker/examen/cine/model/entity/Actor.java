package edu.iker.examen.cine.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    
    
}
