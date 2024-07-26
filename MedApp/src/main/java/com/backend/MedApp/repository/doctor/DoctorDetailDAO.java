package com.backend.MedApp.repository.doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.MedApp.entity.doctor.DoctorDetaildto;

@Repository
public interface DoctorDetailDAO extends JpaRepository<DoctorDetaildto, Integer> 
{
	
}
