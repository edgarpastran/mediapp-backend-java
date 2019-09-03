package com.mediapp.service;

import java.util.List;

import com.mediapp.model.Menu;

public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
