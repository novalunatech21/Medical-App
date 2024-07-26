package com.backend.MedApp.controller.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.MedApp.entity.manager.ManagerDetaildto;
import com.backend.MedApp.service.manager.ManagerDetailService;

@RestController
@RequestMapping("managerdetails")
public class ManagerDetailController {
	
	@Autowired
	ManagerDetailService mgrserv;
	
	@PostMapping("create")
	public ResponseEntity<String> createManager(@RequestBody ManagerDetaildto mandet) {
		return mgrserv.createManager(mandet) ;
	}
	
	@GetMapping("managerList")
	public ResponseEntity<List<ManagerDetaildto>> getAllManagers() {
		return mgrserv.getAllManagers();
	}
	
}
