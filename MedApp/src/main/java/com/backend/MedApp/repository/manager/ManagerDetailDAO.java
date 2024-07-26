package com.backend.MedApp.repository.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.MedApp.entity.manager.ManagerDetaildto;

@Repository
public interface ManagerDetailDAO extends JpaRepository<ManagerDetaildto, Integer>{

}
