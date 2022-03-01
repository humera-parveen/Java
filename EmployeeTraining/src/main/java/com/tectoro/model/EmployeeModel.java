package com.tectoro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeRole;
	private String EmployeeEmail;
	private long EmployeeContact;
	private int EmployeeSal;
	private String TrainerName;
	private int TrainerSal;
	private String Subject;
	private int TrainerId;

	public EmployeeModel(int employeeId, String employeeName, String employeeRole, String employeeEmail,
			long employeeContact, int employeeSal, String trainerName, int trainerSal, String subject, int trainerId) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeRole = employeeRole;
		EmployeeEmail = employeeEmail;
		EmployeeContact = employeeContact;
		EmployeeSal = employeeSal;
		TrainerName = trainerName;
		TrainerSal = trainerSal;
		Subject = subject;
		TrainerId = trainerId;
	}

	public EmployeeModel() {
		super();
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeRole() {
		return EmployeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		EmployeeRole = employeeRole;
	}

	public String getEmployeeEmail() {
		return EmployeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}

	public long getEmployeeContact() {
		return EmployeeContact;
	}

	public void setEmployeeContact(long employeeContact) {
		EmployeeContact = employeeContact;
	}

	public int getEmployeeSal() {
		return EmployeeSal;
	}

	public void setEmployeeSal(int employeeSal) {
		EmployeeSal = employeeSal;
	}

	public String getTrainerName() {
		return TrainerName;
	}

	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}

	public int getTrainerSal() {
		return TrainerSal;
	}

	public void setTrainerSal(int trainerSal) {
		TrainerSal = trainerSal;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getTrainerId() {
		return TrainerId;
	}

	public void setTrainerId(int trainerId) {
		TrainerId = trainerId;
	}

}
