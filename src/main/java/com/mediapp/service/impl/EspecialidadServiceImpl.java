package com.mediapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediapp.model.Especialidad;
import com.mediapp.repo.IEspecialidadRepo;
import com.mediapp.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired	
	private IEspecialidadRepo repo;
	
	@Override
	public Especialidad registrar(Especialidad obj) {
		return repo.save(obj);		
	}

	@Override
	public Especialidad modificar(Especialidad obj) {
		return repo.save(obj);
	}

	@Override
	public List<Especialidad> listar() { 
		return repo.findAll();
	}

	@Override
	public Especialidad leerPorId(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

}
