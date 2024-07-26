package com.backend.MedApp.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.MedApp.entity.patient.PatientCredential;
import com.backend.MedApp.service.patient.RegisterPatientService;

@RestController
@RequestMapping("PatientAccount")
public class RegisterPatientController {
	
	@Autowired
	RegisterPatientService rgaccserv;
	
	@PostMapping("createAccount")
	public ResponseEntity<String> createaccount(@RequestBody PatientCredential userdata)
	{
		return rgaccserv.createaccount(userdata);
	}
	
	@GetMapping("AccountDetails")
	public ResponseEntity<List<PatientCredential>> showAllAccounts()
	{
		return rgaccserv.showAllAccounts();
	}
}
