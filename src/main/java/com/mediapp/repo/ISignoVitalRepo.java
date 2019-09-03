package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.SignoVital;

public interface ISignoVitalRepo extends JpaRepository<SignoVital, Integer> {

}
