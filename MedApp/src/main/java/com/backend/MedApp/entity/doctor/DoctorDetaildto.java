package com.backend.MedApp.entity.doctor;

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
@Table(name="DoctorsList")
public class DoctorDetaildto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private int id;
	
	@Column(name="doctor_name")
	private String name;
	
	@Column(name="doctor_dept")
	private String department;

	@Column(name="doctor_experience")
	private int experience;
	
	@Column(name="doctor_dateofjog")
	private java.sql.Date DateOfJog;
	
	@Column(name="doctor_dob")
	private java.sql.Date dob;
	
	@Column(name="doctor_qualification")
	private String qualification;
	
	@Column(name="doctor_previousworkexperience")
	private String prevWorkExp;
	
	@Lob
	@Column(name="doctor_image", columnDefinition="LONGBLOB")
	private byte[] image;
	
	@Column(name="doctor_phoneno")
	private long phoneno;
	
	@Column(name="doctor_email",unique=true)
	private String email;
	
	@Column(name="doctor_age")
	private int age;
	
	@Column(name="doctor_language")
	private String language;

}
