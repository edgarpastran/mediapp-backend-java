package com.mediapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediapp.model.Examen;
import com.mediapp.repo.IExamenRepo;
import com.mediapp.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService{

	@Autowired	
	private IExamenRepo repo;
	
	@Override
	public Examen registrar(Examen obj) {
		return repo.save(obj);		
	}

	@Override
	public Examen modificar(Examen obj) {
		return repo.save(obj);
	}

	@Override
	public List<Examen> listar() { 
		return repo.findAll();
	}

	@Override
	public Examen leerPorId(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

}
