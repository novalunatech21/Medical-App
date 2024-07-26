package com.backend.MedApp.entity.appointment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="appointment_data")
public class appointmentdto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="private_id")
	private int id;
	
	@Column(name="appointment_date")
	private java.sql.Date date;
	 
}
