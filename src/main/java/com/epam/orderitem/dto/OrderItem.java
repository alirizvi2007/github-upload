package com.epam.orderitem.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrderItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6649312158797890977L;
    @Id
	private Integer productCode;
	
	private String productName;
	
	private int quantity;

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
