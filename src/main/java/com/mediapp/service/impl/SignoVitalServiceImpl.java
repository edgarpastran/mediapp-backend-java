package com.mediapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mediapp.model.SignoVital;
import com.mediapp.repo.ISignoVitalRepo;
import com.mediapp.service.ISignoVitalService;

@Service
public class SignoVitalServiceImpl implements ISignoVitalService {

	@Autowired
	private ISignoVitalRepo repo;
	
	@Override
	public SignoVital registrar(SignoVital t) {		
		return this.repo.save(t);
	}

	@Override
	public SignoVital modificar(SignoVital t) {
		return this.repo.save(t);
	}

	@Override
	public SignoVital leerPorId(Integer id) {
		return this.repo.findOne(id);
	}

	@Override
	public List<SignoVital> listar() {
		return this.repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		this.repo.delete(id);
	}

	@Override
	public Page<SignoVital> listarPageable(Pageable pageable) {
		return this.repo.findAll(pageable);
	}

}
