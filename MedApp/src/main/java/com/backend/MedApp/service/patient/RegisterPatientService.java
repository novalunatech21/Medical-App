package com.backend.MedApp.service.patient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.MedApp.entity.patient.PatientCredential;
import com.backend.MedApp.repository.patient.PatientAccount;

@Service
public class RegisterPatientService {

	@Autowired
	PatientAccount patacc;
	
	@Autowired
	private PasswordEncoder passenc;
	
	public ResponseEntity<String> createaccount(PatientCredential userdata) {
		
		userdata.setPassword(passenc.encode(userdata.getPassword()));
		patacc.save(userdata);
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

	public ResponseEntity<List<PatientCredential>> showAllAccounts() {
		
		try {
			return new ResponseEntity<>(patacc.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

}
