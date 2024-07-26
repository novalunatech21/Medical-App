package com.backend.MedApp.service.doctor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.backend.MedApp.entity.doctor.DoctorDetaildto;
import com.backend.MedApp.repository.doctor.DoctorDetailDAO;

@Service
public class DoctorDetailService {

	@Autowired
	DoctorDetailDAO docdao;

	 public ResponseEntity<String> createDoctor(DoctorDetaildto docdet, MultipartFile multipartfile) throws IOException {
	        if (multipartfile != null && !multipartfile.isEmpty()) {
	            byte[] imageBytes = multipartfile.getBytes();
	            docdet.setImage(imageBytes);
	            docdao.save(docdet);
	            return new ResponseEntity<>("Doctor created successfully", HttpStatus.OK);
	        }
	        
	        return new ResponseEntity<>("Failed", HttpStatus.OK);
	    }

	public ResponseEntity<List<DoctorDetaildto>> showDoctors() {
		
		try {
			return new ResponseEntity<>(docdao.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
