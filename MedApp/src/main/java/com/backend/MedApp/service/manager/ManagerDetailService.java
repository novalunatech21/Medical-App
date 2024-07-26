package com.backend.MedApp.service.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backend.MedApp.entity.manager.ManagerDetaildto;
import com.backend.MedApp.repository.manager.ManagerDetailDAO;

@Service
public class ManagerDetailService {

	
	@Autowired
	ManagerDetailDAO mgrdao;
	
	public ResponseEntity<String> createManager(ManagerDetaildto mandet) {
		mgrdao.save(mandet);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<ManagerDetaildto>> getAllManagers() {
		
		try {
			return new ResponseEntity<>(mgrdao.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
