package com.backend.MedApp.repository.patient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.MedApp.entity.patient.PatientDetaildto;


@Repository
public interface PatientDAO extends JpaRepository<PatientDetaildto, Long> 
{

	Optional<PatientDetaildto> findByEmail(String email);
}
