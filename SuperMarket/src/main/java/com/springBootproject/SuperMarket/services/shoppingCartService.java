package com.springBootproject.SuperMarket.services;

import java.util.List;

import com.springBootproject.SuperMarket.Entities.product;
import com.springBootproject.SuperMarket.Entities.shoppingCart;

public interface shoppingCartService {
	
	public shoppingCart removeItem(product Product, int quantity);
	public shoppingCart getTotalCost();
	public List<product> getItems();
	public shoppingCart getItemCount(product Product);
	product getProduct(Long product_id);
	shoppingCart getShoppingCart(Long product_id);
	public shoppingCart addItem(shoppingCart product);
	
	public shoppingCart save(shoppingCart ShoppingCart)  ;
}
