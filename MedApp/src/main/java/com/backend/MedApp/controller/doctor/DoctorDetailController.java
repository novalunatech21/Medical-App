package com.backend.MedApp.controller.doctor;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.backend.MedApp.entity.doctor.DoctorDetaildto;
import com.backend.MedApp.service.doctor.DoctorDetailService;

@RestController
@RequestMapping("/doctordetails")
public class DoctorDetailController {
	
	@Autowired
	DoctorDetailService docserv;
	
	  @PostMapping("/create")
	  public ResponseEntity<String> createDoctor(@ModelAttribute DoctorDetaildto docdet, @RequestParam("doctor_image") MultipartFile multipartfile) {
	        try {
	            return docserv.createDoctor(docdet, multipartfile);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while creating doctor");
	        }
	    }
	  
	  @GetMapping("/doctorsList")
	  public ResponseEntity<List<DoctorDetaildto>> showDoctors()
	  {
		  return docserv.showDoctors();
	  }
}
