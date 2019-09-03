package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.Archivo;

public interface IArchivoRepo extends JpaRepository<Archivo, Integer>{

}
