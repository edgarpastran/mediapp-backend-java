package com.mediapp.dto;

import java.util.List;

import com.mediapp.model.Consulta;
import com.mediapp.model.Examen;

public class ConsultaListaExamenDTO {

	private Consulta consulta;
	private List<Examen> listExamen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Examen> getListExamen() {
		return listExamen;
	}

	public void setListExamen(List<Examen> listExamen) {
		this.listExamen = listExamen;
	}

}
