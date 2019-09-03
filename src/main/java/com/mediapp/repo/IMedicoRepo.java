package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{

	
}
