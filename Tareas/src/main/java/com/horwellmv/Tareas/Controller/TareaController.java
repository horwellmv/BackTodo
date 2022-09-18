package com.horwellmv.Tareas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horwellmv.Tareas.Entity.Tarea;
import com.horwellmv.Tareas.Service.TareaService;

@RestController
@CrossOrigin 
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
	private TareaService tareaService;
	
	@PostMapping("/save")
	public ResponseEntity<Tarea> save(@RequestBody Tarea tarea){
		return  new ResponseEntity<>(tareaService.save(tarea), HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Tarea>> findAll(){
		return new ResponseEntity<>(tareaService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarea> get(@PathVariable Integer id){
		return new ResponseEntity<>(tareaService.get(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Tarea> edit(@PathVariable Integer id, @RequestBody Tarea tarea){
		tareaService.edit(id, tarea.getTarea(), tarea.getResponsable(), tarea.getActiva());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer id) {
		tareaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
