package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({@NamedQuery(name = "Manufacturer.listAll", query = "SELECT id, description, manufacturerName FROM Manufacturer")}) 
public class Manufacturer extends AbstractDomain{
	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String description;
	
	@Column(nullable = false, length = 20)
	private String manufacturerName;
	
	public Manufacturer() {
		
	}
	
	public Manufacturer(String description, String manufacturerName) {
		this.description = description;
		this.manufacturerName = manufacturerName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public void setManufacturerName(String name) {
		this.manufacturerName = name;
	}
	
	@Override
	public String toString() {
		return "Manufacturer Name: " + getManufacturerName() + "\nDescription: " + getDescription();
	}

}
