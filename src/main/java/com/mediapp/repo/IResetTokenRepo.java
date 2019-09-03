package com.mediapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediapp.model.ResetToken;

public interface IResetTokenRepo extends JpaRepository<ResetToken, Long> {
	
	//from ResetToken where token = :?
	ResetToken findByToken(String token);

}
