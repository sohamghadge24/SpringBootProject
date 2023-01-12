package com.springBootproject.SuperMarket.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Product")
public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long product_id ;
	@Column(name="Pname")
	
	private String product_name;
	@Column(name="P_prise")
	private static float product_price;
	@Column(name="P_Stock")
	private int product_quantity_in_stock;
	
	@OneToOne(targetEntity=shoppingCart.class)  
	private shoppingCart ShoppingCart;
	
	
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public static float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public int getProduct_quantity_in_stock() {
		return product_quantity_in_stock;
	}
	public void setProduct_quantity_in_stock(int product_quantity_in_stock) {
		this.product_quantity_in_stock = product_quantity_in_stock;
	}
	public product(long product_id, String product_name, float product_price, int product_quantity_in_stock) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_quantity_in_stock = product_quantity_in_stock;
	}
	
	public product() {}
	
	
}

/*
 * "product_name":"Apple",
 * "product_price":20,
 * "product_quantity_in_stock":50
 * 
 * */
