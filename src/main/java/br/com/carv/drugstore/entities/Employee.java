package br.com.carv.drugstore.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee extends Person {

	private static final long serialVersionUID = 1L;
	@Column(nullable = false, length = 15)
	private String workCard; 
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date admissionDate; 
	
	@JoinColumn(nullable = false)
	@OneToOne
	public Person employeePerson;
	
	public Employee() {
		
	}
	
	public Employee(String workCard, Date admissionDate) {
		this.workCard = workCard; 
		this.admissionDate = admissionDate;
	}
	
	public String getWorkCard() {
		return workCard;
	}
	
	public void setWorkCard(String workCard) {
		this.workCard = workCard;
	}
	
	public Date getAdmissionDate() {
		return admissionDate;
	}
	
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	public Person getEmployeePerson() {
		return employeePerson;
	}
	
	public void setEmployeePerson(Person employeePerson) {
		this.employeePerson = employeePerson;
	}
	
	@Override
	public String toString() {
		return "Employee: " + getEmployeePerson().toString() + "Admission Date: " + getAdmissionDate() + "Work Card: " + getWorkCard();
	}
	
	
	

}
