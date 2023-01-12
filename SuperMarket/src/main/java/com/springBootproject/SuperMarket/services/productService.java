package com.springBootproject.SuperMarket.services;


import com.springBootproject.SuperMarket.Entities.product;

public interface productService {
	product  getQuantityInStock(Long Product_id);
	
	product  update_QuantityInStock(product Product,int Stock,String Type);
	
	product saveProduct(product Product);
		
	product updateProduct(product Product);
		
	Boolean deleteProduct(Long  Product_id);
		
	product getProduct(Long Product_id);
}
