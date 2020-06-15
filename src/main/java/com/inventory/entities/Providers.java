package com.inventory.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="providers")
public class Providers implements Serializable{

	@Id
	@Column(name="provider_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long providerId;
	
	@Column(name="provider_name", nullable=false)
	private String providerName;
	

	public Long getProviderId() {
		return providerId;
	}


	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}


	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	
	private static final long serialVersionUID = 1L;
}
