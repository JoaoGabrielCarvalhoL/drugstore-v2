package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Telephone extends AbstractDomain {
	
	private static final long serialVersionUID = 1L;
	@Column(nullable = true, length = 13)
	private String telephone;
	@Column(nullable = false, length = 13)
	private String cellphone; 
	
	public Telephone() {
		
	}
	
	public Telephone(String telephone, String cellphone) {
		this.telephone = telephone;
		this.cellphone = cellphone;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getCellphone() {
		return cellphone;
	}
	
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	@Override
	public String toString() {
		return "Telephone: " + getTelephone() + " - Cellphone: " + getCellphone();
	}
	
	

}
