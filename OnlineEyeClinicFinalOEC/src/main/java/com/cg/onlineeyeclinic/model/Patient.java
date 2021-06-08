package com.cg.onlineeyeclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;



/** This is an entity class for Patient with getters and setters and Parameterized constructor
 * 
 * @author Prudhvi Mypati
 *
 */


@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@Column(name="patient_id",length=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long patientId;
	
	@Column(name="patient_name", length=15)
	private String patientName;
	
	@Column(name="patient_age", length=3)
	private Integer patientAge;
	
	@Column(name="patient_mobile", length=10)
	private String patientMobile;
	
	@Column(name="patient_email", length=20)
	private String patientEmail;
	
	@Column(name="patient_dob", length=20)
	private LocalDate patientDOB;
	
	@Column(name="patient_username", length=20)
	private String patientUserName;
	
	@Column(name="patient_password", length=20)
	private String patientPassword;
	
	@Column(name="patient_address", length=30)
	private String patientAddress;
	
//	@OneToOne(mappedBy="patient")
//	@JoinColumn(name = "appointment_id")
//	@JsonIgnore
//	private Appointment appointment;
	
	public Patient() {
	}

	/** This is an Parameterized constructor for Patient Class to initialize the Patient details
	 * 
	 */

	public Patient(String patientName, Integer patientAge, String patientMobile, String patientEmail,
			LocalDate patientDOB, String patientUserName, String patientPassword, String patientAddress) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientMobile = patientMobile;
		this.patientEmail = patientEmail;
		this.patientDOB = patientDOB;
		this.patientUserName = patientUserName;
		this.patientPassword = patientPassword;
		this.patientAddress = patientAddress;
	}

	
	//getters and setters
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientMobile() {
		return patientMobile;
	}

	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public LocalDate getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(LocalDate patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

//	public Appointment getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(Appointment appointment) {
//		this.appointment = appointment;
//	}
	

	// Method to display Patient Details
	@Override
	public String toString() {
		return "Patient [Patient Id=" + patientId + "\n Patient Name=" + patientName + "\n Patient Age=" + patientAge
				+ "\n Patient Mobile=" + patientMobile + "\n Patient Email=" + patientEmail + "\n Patient DOB=" + patientDOB
				+ "\n Patient UserName=" + patientUserName + "\n Patient Password=" + patientPassword + "\n Patient Address="
				+ patientAddress +"]";
	}
	
	
	
}
