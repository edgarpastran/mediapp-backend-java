package com.mediapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mediapp.model.SignoVital;

public interface ISignoVitalService extends ICRUD<SignoVital> {

	Page<SignoVital> listarPageable(Pageable pageable);
	
}
