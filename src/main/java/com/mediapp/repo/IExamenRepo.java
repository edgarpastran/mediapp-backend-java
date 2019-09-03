package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{

	
}
