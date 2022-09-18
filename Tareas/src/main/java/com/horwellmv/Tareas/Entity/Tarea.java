package com.horwellmv.Tareas.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Tareas")
public class Tarea {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String Tarea;
	private String Responsable;
	private Boolean Activa;
	
	
	public Tarea() {

	}

	public Tarea(String tarea, String responsable, Boolean activa) {
		super();
		Tarea = tarea;
		Responsable = responsable;
		Activa = activa;
	}
	//---------Gets and Sets
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTarea() {
		return Tarea;
	}
	public void setTarea(String tarea) {
		Tarea = tarea;
	}
	public String getResponsable() {
		return Responsable;
	}
	public void setResponsable(String responsable) {
		Responsable = responsable;
	}
	public Boolean getActiva() {
		return Activa;
	}
	public void setActiva(Boolean activa) {
		Activa = activa;
	}

}
