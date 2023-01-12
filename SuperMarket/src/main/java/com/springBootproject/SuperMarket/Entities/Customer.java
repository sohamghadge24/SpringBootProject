package com.springBootproject.SuperMarket.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cid")
	private long customer_id;
	@Column(name="Cname")
	private String name;
	@Column(name="Caddress")
	private String address;
	
	public Customer(long customer_id, String name, String address) {
		this.customer_id = customer_id;
		this.name = name;
		this.address = address;
	}
	public Customer() {}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
