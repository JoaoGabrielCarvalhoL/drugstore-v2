package br.com.carv.drugstore.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SaleItem extends AbstractDomain {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private Short amountItems;
	
	@Column(nullable = false, precision = 8, scale = 2)
	private BigDecimal unitPrice; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Product product; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Sale sale;
	
	public SaleItem() {
		
	}
	
	public SaleItem(Short amountItems, BigDecimal unitPrice) {
		this.amountItems = amountItems;
		this.unitPrice = unitPrice;
	}
	
	public Short getAmountItems() {
		return amountItems;
	}
	
	public void setAmountItems(Short amountItems) {
		this.amountItems = amountItems;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Sale getSale() {
		return sale;
	}
	
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	
	@Override 
	public String toString() {
		return "Amount of items: " + getAmountItems() + " - Unit Price of Items: " + getUnitPrice() + "\nProduct: " + getProduct().toString() + "Data of Sale: " + getSale().toString();
	}
}
