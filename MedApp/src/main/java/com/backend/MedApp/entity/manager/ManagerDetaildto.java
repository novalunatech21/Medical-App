package com.backend.MedApp.entity.manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Manager_detail_list")
public class ManagerDetaildto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manager_id")
	private int id;
	
	@Column(name="manager_name")
	private String name;
	
	@Column(name="manager_password")
	private String password;
	
	@Column(name="manager_dept")
	private String department;
	
	@Column(name="manager_experience")
	private int experience;
	
	@Column(name="manager_date_of_joining")
	private java.sql.Date dateOfJoining;
	
	@Column(name="manager_qualification")
	private String qualification;
	
	@Column(name="manager_date_of_birth")
	private java.sql.Date dob;
	
	@Column(name="manager_gender")
	private String gender;
	
	@Lob
	@Column(name="manager_image", columnDefinition = "LONGBLOB")
	private byte[] image;
	
	@Column(name="manager_phone_no")
	private long phoneNo;
}
