package com.backend.MedApp.repository.patient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.MedApp.entity.patient.PatientCredential;

@Repository
public interface PatientAccount extends JpaRepository<PatientCredential, Long>{

	Optional<PatientCredential> findByEmail(String email);
}
