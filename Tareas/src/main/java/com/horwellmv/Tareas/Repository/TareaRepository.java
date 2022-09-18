package com.horwellmv.Tareas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horwellmv.Tareas.Entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {

}
