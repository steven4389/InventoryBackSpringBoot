package com.inventory.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products implements Serializable {

	@Id
	@Column(name="ref")
	private String ref;
	
	@Column(nullable=false, unique=true)
	private String product;


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}
	


	private static final long serialVersionUID = 1L;

}
