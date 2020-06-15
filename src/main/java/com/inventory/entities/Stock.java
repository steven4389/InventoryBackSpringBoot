package com.inventory.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="stock")
public class Stock implements Serializable{



	@Id
	@Column(name="stock_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long stockId;
	
	@Column(nullable=false, unique=true)
	private String quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ref", referencedColumnName="ref", insertable=false, updatable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Products products;

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", quantity=" + quantity + ", products=" + products + "]";
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
