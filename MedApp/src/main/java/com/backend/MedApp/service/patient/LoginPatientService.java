package com.backend.MedApp.service.patient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.MedApp.entity.patient.PatientCredential;
import com.backend.MedApp.entity.patient.PatientDetaildto;
import com.backend.MedApp.repository.patient.PatientAccount;
import com.backend.MedApp.repository.patient.PatientDAO;

@Service
public class LoginPatientService {

	@Autowired
	PatientAccount patacc;

	@Autowired
	PasswordEncoder passenc;

	public ResponseEntity<String> loginConfirm(String email,String password) {
		Optional<PatientCredential> user= patacc.findByEmail(email);
		if(user.isPresent()&& passenc.matches(password, user.get().getPassword()))
		{
			return new ResponseEntity<>("Login Success",HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>("Invalid Login",HttpStatus.UNAUTHORIZED);
		}
	}

}
