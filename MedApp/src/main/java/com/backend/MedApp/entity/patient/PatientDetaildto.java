package com.backend.MedApp.entity.patient;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="PatientsList")
public class PatientDetaildto {
	
	@Id
	@Column(name="aadhar_No",unique=true, nullable= false)
	private Long aadharNo;
	
	@Column(name="name")
	private String name;
	
	@Column(name="Phone_No")
	private long phoneNo;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DOB")
	private java.sql.Date dob;
	
	@Column(name="Email",unique = true)
	private String email;
	
	@Column(name="Blood_Group")
	private String bloodgroup;
	
	@Column(name="Address")
	private String address;
	
}
