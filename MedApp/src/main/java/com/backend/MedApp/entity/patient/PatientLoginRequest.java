package com.backend.MedApp.entity.patient;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PatientLoginRequest {
	
	private String email;
	private String password;
}
