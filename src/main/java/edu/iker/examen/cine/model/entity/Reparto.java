package edu.iker.examen.cine.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    

    
    
}
