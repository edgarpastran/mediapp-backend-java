package com.mediapp.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mediapp.exception.ModelNotFoundException;
import com.mediapp.model.SignoVital;
import com.mediapp.service.ISignoVitalService;

@RestController
@RequestMapping("/signos_vitales")
public class SignoVitalController {

	@Autowired
	private ISignoVitalService service;
	
	@GetMapping
	public ResponseEntity<List<SignoVital>> listar() {
		List<SignoVital> lista = this.service.listar();
		return new ResponseEntity<List<SignoVital>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<SignoVital>> listarPageable(Pageable pageable) {
		Page<SignoVital> lista = this.service.listarPageable(pageable);
		return new ResponseEntity<Page<SignoVital>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SignoVital> leerPorId(@PathVariable("id") Integer id) {
		SignoVital signoVital = this.service.leerPorId(id);
		if (signoVital == null) {
			throw new ModelNotFoundException("ID NO ENCONTRADO: "+id);
		}
		return new ResponseEntity<SignoVital>(signoVital, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody SignoVital signoVital) {
		SignoVital result = this.service.registrar(signoVital);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getIdSignoVital()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Object> modificar(@Valid @RequestBody SignoVital signoVital) {
		this.service.modificar(signoVital);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(Integer id) {
		SignoVital signoVital = this.service.leerPorId(id);
		if (signoVital == null) {
			throw new ModelNotFoundException("ID NO ENCONTRADO: "+id);
		}
		else {
			this.service.eliminar(id);
		}
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
