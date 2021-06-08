package com.cg.onlineeyeclinic.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "Appointments")
public class Appointment {

	
	@Id
	@Column(name = "appointment_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer appointmentId;
	@Column
	@NotNull(message = "Appointment Date should not be Empty")
	private LocalDate dateOfAppointment;
	@Column
	@NotNull(message = "Appointment Time should not be Empty")
	private LocalTime timeOfAppointment;
	@Column
	@Min(value = 100)
	@Max(value = 200000)
	@Positive(message = "fees limit between 100 to 200000")
	private Double consultationFee;

	private Long doctorId;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "patient_id")
	private Long patientId;
	
	

	public Appointment() {

	}

	public Appointment(LocalDate dateOfAppointment, LocalTime timeOfAppointment, Long patientId, Long doctorId) {
		super();
		this.dateOfAppointment = dateOfAppointment;
		this.timeOfAppointment = timeOfAppointment;
		this.consultationFee = 1000.00;
		this.doctorId = doctorId;
		this.patientId = patientId;

	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDate getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public LocalTime getTimeOfAppointment() {
		return timeOfAppointment;
	}

	public void setTimeOfAppointment(LocalTime timeOfAppointment) {

		this.timeOfAppointment = timeOfAppointment;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(Double consultationFee) {
		this.consultationFee = consultationFee;
	}

//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
}