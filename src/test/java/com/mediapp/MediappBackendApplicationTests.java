package com.mediapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.mediapp.model.Usuario;
import com.mediapp.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediappBackendApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Test
	public void crearUsuario() {
		Usuario us = new Usuario();
		us.setIdUsuario(3);
		us.setUsername("test-mediapp@dispostable.com");
		us.setPassword(bcrypt.encode("123"));
		us.setEnabled(true);
		
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
