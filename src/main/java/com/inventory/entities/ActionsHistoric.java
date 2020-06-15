package com.inventory.entities;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="ActionsHistoric")
public class ActionsHistoric implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int historicId;
	
	@Column(nullable=false, unique=true)
	private String ref;
	
	@Column(nullable=false, unique=true)
	private Long cost; 
	
	@Column(nullable=false, unique=true)
	private int quantity; 
	
	@Column(nullable=false, unique=true)
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="actionId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Actions actions;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="providerId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Providers provides;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ref", referencedColumnName="ref", insertable=false, updatable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Products products;

	public int getHistoricId() {
		return historicId;
	}

	public void setHistoricId(int historicId) {
		this.historicId = historicId;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Actions getActions() {
		return actions;
	}

	public void setActions(Actions actions) {
		this.actions = actions;
	}

	public Providers getProvides() {
		return provides;
	}

	public void setProvides(Providers provides) {
		this.provides = provides;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	
}
