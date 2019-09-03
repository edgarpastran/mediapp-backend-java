package com.mediapp.service;

import java.util.List;

import com.mediapp.dto.ConsultaListaExamenDTO;
import com.mediapp.dto.ConsultaResumenDTO;
import com.mediapp.dto.FiltroConsultaDTO;
import com.mediapp.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO consultaDTO);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen();

	byte[] generarReporte();
}
