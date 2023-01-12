package com.springBootproject.SuperMarket.Entities;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name="Shopping_Cart")
public class shoppingCart {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cart_Id")
	private long item_id;
	@PrimaryKeyJoinColumn() 
	@Column(name="P_Id")
	private long Product_id;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Pname")
	private String Product_name;
	@Column(name="Total_Price")
	private float totalPrice;
	public long getItem_id() {
		return item_id;
	}
	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}
	public long getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(long product_id) {
		Product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	public shoppingCart(long item_id, long product_id, int quantity, String product_name, float totalPrice) {
		this.item_id = item_id;
		Product_id = product_id;
		this.quantity = quantity;
		Product_name = product_name;
		this.totalPrice = totalPrice;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public shoppingCart() {}
}
