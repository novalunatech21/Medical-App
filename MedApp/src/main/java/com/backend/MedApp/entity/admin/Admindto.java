//package com.backend.MedApp.entity.admin;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import com.backend.MedApp.entity.Prescriptiondto;
//import com.backend.MedApp.entity.doctor.DoctorDetaildto;
//import com.backend.MedApp.entity.manager.ManagerDetaildto;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//
//@Entity
//@Table(name="admin_list")
//public class Admindto {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="admin_id")
//	private int id;
//	
//	@Column(name="shipment_date")
//	private java.sql.Date shipdate;
//	
//	@OneToMany(mappedBy = "admin")
//	private List<ManagerDetaildto> managers;
//	
//	@OneToMany(mappedBy = "admin")
//	private List<DoctorDetaildto> doctors;
//	
//	@OneToMany(mappedBy = "admin")
//	private List<Prescriptiondto> prescriptions;
//}
