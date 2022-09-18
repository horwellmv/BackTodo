package com.horwellmv.Tareas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horwellmv.Tareas.Entity.Tarea;
import com.horwellmv.Tareas.Repository.TareaRepository;

@Service
public class TareaService {
	@Autowired
	private TareaRepository tareaRepository;
	
	public List<Tarea> findAll(){
		return tareaRepository.findAll();
	}
	
	public Tarea save(Tarea tarea) {
		return tareaRepository.save(tarea);
	}
	
	public Tarea get(Integer id){
		
		return tareaRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		tareaRepository.deleteById(id);
	}
	
	public Tarea edit(Integer id,String tarea, String responsable,Boolean activa) {
		Tarea nuevaTarea= new Tarea("", "", false);
		nuevaTarea=tareaRepository.findById(id).get();
		nuevaTarea.setActiva(activa);
		nuevaTarea.setTarea(tarea);
		nuevaTarea.setResponsable(responsable);
		
		return tareaRepository.save(nuevaTarea);
	}

}
