package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private String userId;
	private String customerName;
	private String emailAddress;
	private long mobileNumber;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="delivery_address",joinColumns = {@JoinColumn(name="userId")},inverseJoinColumns = {@JoinColumn(name="addressId")})
	List<Communication> deliveryAddress=new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Communication> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(List<Communication> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	
	
	
	

}
