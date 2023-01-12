package com.springBootproject.SuperMarket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootproject.SuperMarket.Entities.product;

import com.springBootproject.SuperMarket.Repository.*;

@Service
public class productSevericeImp implements productService {


	@Autowired
	private productResp pro;
	@Override
	public product getQuantityInStock(Long Product_id) {
		
		return pro.findById(Product_id).orElseThrow(()-> new RuntimeException(Product_id+" not found"));
	}



	@Override
	public product update_QuantityInStock(product Product,int Stock,String Type) {
		product getdata= getProduct(Product.getProduct_id());
		product data=new product();
		if(data!=null&& Type.equalsIgnoreCase("addStock")) {
			data.setProduct_quantity_in_stock((Product.getProduct_quantity_in_stock()+Stock));    ///for add shock
		}
		if(data!=null&& Type.equalsIgnoreCase("reduceStock")) {
			data.setProduct_quantity_in_stock((Product.getProduct_quantity_in_stock()-Stock)); 			///for reduce shock
		}
		return pro.save(data);
	}



	@Override
	public product saveProduct(product Product) {
		return pro.save(Product);
	}

	@Override
	public product updateProduct(product Product) {
		product getdata= getProduct(Product.getProduct_id());
		product data=new product();
		if(data!=null) {
			data.setProduct_id(Product.getProduct_id());
			data.setProduct_name(Product.getProduct_name());
			data.setProduct_price(Product.getProduct_price());
			data.setProduct_quantity_in_stock(Product.getProduct_quantity_in_stock());
		}
		return pro.save(data);
	}

	@Override
	public Boolean deleteProduct(Long Product_id) {
		pro.deleteById(Product_id);
		return true;
	}

	@Override
	public product getProduct(Long Product_id) {
		// TODO Auto-generated method stub
		
		return  pro.findById(Product_id).orElseThrow(()->new RuntimeException("Id not found!!!"));
	}
	

}
/*method
 * public Boolean deleteProduct(Long Product_id) {
 * public product getProduct(Long Product_id) {
 * public product updateProduct(product Product) {
 * public product saveProduct(product Product) {
 * public product update_QuantityInStock(product Product,int Stock,String Type) {
 * public product getQuantityInStock(Long Product_id) {
 * */

