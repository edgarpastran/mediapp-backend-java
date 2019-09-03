package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

	
}
