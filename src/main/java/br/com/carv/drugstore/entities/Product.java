package br.com.carv.drugstore.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product extends AbstractDomain {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 20)
	private String productName;
	
	@Column(nullable = false, length = 50)
	private String description; 
	
	@Column(nullable = false)
	private Short amount; 
	
	@Column(nullable = false, precision = 8, scale = 2)
	private BigDecimal unitPrice; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Manufacturer manufacturer;
	
	public Product() {
		
	}
	
	public Product(String productName, String description, Short amount, BigDecimal unitPrice) {
		this.productName = productName;
		this.description = description; 
		this.amount = amount; 
		this.unitPrice = unitPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Short getAmount() {
		return amount;
	}
	
	public void setAmount(Short amount) {
		this.amount = amount;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Product Name: " + getProductName() + "\nDescription: " + getDescription() + 
				"\nUnit Price: " + getUnitPrice() + "\nAmount: " + getAmount() + 
				"\nManufacturer: " + getManufacturer().toString();
	}

}
