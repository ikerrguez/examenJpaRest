package edu.iker.examen.cine.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iker.examen.cine.model.entity.Actor;

public interface IActorRepository extends JpaRepository <Actor, Long> {
    

}
