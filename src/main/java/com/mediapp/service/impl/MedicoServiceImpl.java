package com.mediapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.mediapp.model.Medico;
import com.mediapp.repo.IMedicoRepo;
import com.mediapp.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired	
	private IMedicoRepo repo;
	
	@Override
	public Medico registrar(Medico obj) {
		return repo.save(obj);		
	}

	@Override
	public Medico modificar(Medico obj) {
		return repo.save(obj);
	}

	@PreAuthorize("@restAuthServiceImpl.hasAccess('listar')")
	//@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
	@Override
	public List<Medico> listar() { 
		return repo.findAll();
	}

	@Override
	public Medico leerPorId(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
	}

}
