package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address extends AbstractDomain {
	
	private static final long serialVersionUID = 1L;
	@Column(nullable = false, length = 60)
	private String street;
	@Column(nullable = false, length = 10)
	private String houseNumber;
	@Column(nullable = false, length = 50)
	private String district;
	@Column(nullable = false, length = 15)
	private String zipCode;
	@Column(nullable = true, length = 50)
	private String complement;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private City city;
	
	
	public Address() {
		
	}
	
	public Address(String street, String houseNumber, String district, String zipCode, String complement, City city) {
		this.street = street;
		this.houseNumber = houseNumber; 
		this.district = district; 
		this.zipCode = zipCode; 
		this.complement = complement; 
		this.city = city;
	}
	
	public String getStreet() {
		return street; 
	}
	
	public void setStreet(String street) {
		this.street = street; 
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "\nStreet: " + getStreet() + " House Number: " + getHouseNumber() + " - Complement: " + getComplement() + 
				"\nDistrict: " + getDistrict() + " Zip Code: " + getZipCode()  + "\nCity: " + getCity().toString();
	}
}

