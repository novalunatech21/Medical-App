package com.backend.MedApp.service.patient;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backend.MedApp.entity.patient.PatientDetaildto;
import com.backend.MedApp.repository.patient.PatientDAO;

@Service
public class PatientDetailService {

	@Autowired
	PatientDAO patientdao;
	
	public ResponseEntity<String> createPatient(PatientDetaildto pat) {
		
		Optional<PatientDetaildto> user= patientdao.findById(pat.getAadharNo());
		if(user.isPresent())
		{
			return new ResponseEntity<>("User with this Aadhar Number already exists",HttpStatus.OK);
		}
		patientdao.save(pat);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	
	}

	public ResponseEntity<List<PatientDetaildto>> showPatients() {
		try
		{
			return new ResponseEntity<>(patientdao.findAll(),HttpStatus.OK);
		}
		catch (Exception e){
            e.printStackTrace();}
		
		return null;
	}

	public ResponseEntity<String> updatePatient(PatientDetaildto pat) {
		
		Optional<PatientDetaildto> user= patientdao.findById(pat.getAadharNo());
		if(user.isPresent())
		{
			patientdao.save(pat);
			return new ResponseEntity<>("Success",HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>("Given Aadhar Number doesn't exist",HttpStatus.NOT_FOUND);
	}
	
}

