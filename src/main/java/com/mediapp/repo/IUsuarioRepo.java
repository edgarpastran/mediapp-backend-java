package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.Usuario;

public interface IUsuarioRepo  extends JpaRepository<Usuario, Integer> {

	//select * from usuario where username = ?
	Usuario findOneByUsername(String username);
}
