package com.backend.MedApp.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.MedApp.entity.patient.PatientLoginRequest;
import com.backend.MedApp.service.patient.LoginPatientService;

@RestController
@RequestMapping("login")
public class LoginPatientController {
	
	@Autowired
	LoginPatientService logserv;
	
	
	@GetMapping("check")
	public ResponseEntity<String> loginConfirm(@RequestBody PatientLoginRequest logreq)
	{
		return logserv.loginConfirm(logreq.getEmail(),logreq.getPassword());
	}
}
