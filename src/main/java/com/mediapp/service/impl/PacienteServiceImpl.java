package com.mediapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mediapp.model.Paciente;
import com.mediapp.repo.IPacienteRepo;
import com.mediapp.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired	
	private IPacienteRepo repo;
	
	@Override
	public Paciente registrar(Paciente pac) {
		return repo.save(pac);
		
	}

	@Override
	public Paciente modificar(Paciente pac) {
		return repo.save(pac);
	}

	@Override
	public List<Paciente> listar() { 
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

	@Override
	public Page<Paciente> listarPageable(Pageable pageable) {		
		return repo.findAll(pageable);
	}

}
