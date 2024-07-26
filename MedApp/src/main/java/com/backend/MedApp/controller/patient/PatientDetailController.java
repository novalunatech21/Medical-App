package com.backend.MedApp.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.MedApp.entity.patient.PatientDetaildto;
import com.backend.MedApp.service.patient.PatientDetailService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("register")
public class PatientDetailController {
	
	@Autowired
	PatientDetailService regserv;
	
	@PostMapping("/createPatient")
	public ResponseEntity<String> createPatient(@RequestBody PatientDetaildto pat)
	{
		return regserv.createPatient(pat);	
	}
	
	
	@GetMapping("/showPatients")
	public ResponseEntity<List<PatientDetaildto>> showPatients() {
		return regserv.showPatients();
	}
	
	@PutMapping("updatePatient")
	public ResponseEntity<String> updatePatient(@RequestBody PatientDetaildto pat) {
		
		return regserv.updatePatient(pat);
	}	
	
}
