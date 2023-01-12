package com.springBootproject.SuperMarket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootproject.SuperMarket.Entities.Customer;
import com.springBootproject.SuperMarket.Entities.product;
import com.springBootproject.SuperMarket.Entities.shoppingCart;
import com.springBootproject.SuperMarket.Repository.productResp;
import com.springBootproject.SuperMarket.Repository.shoppingCartResp;
@Service


public class shoppingCartServiceImp implements  shoppingCartService{
	@Autowired
	private shoppingCartResp s_CartResp;
	@Autowired
	private productResp ProductResp ;
	@Override
	public product getProduct(Long Product_id) {
		// TODO Auto-generated method stub
		return ProductResp.findById(Product_id).orElseThrow(()->new RuntimeException(Product_id+" not found"));
	}
	
	
	@Override
	public shoppingCart getShoppingCart(Long shoppingCart_id) {
		// TODO Auto-generated method stub
		return s_CartResp.findById(shoppingCart_id).orElseThrow(()->new RuntimeException(shoppingCart_id+" not found"));
	}
	
	
//	@Override
//	public shoppingCart addItem(shoppingCart Product) {
//		productSevericeImp Item=new productSevericeImp();
//		Item.getProduct();
//		product getCustomerId=getProduct(Product.getProduct_id());
//		shoppingCart data =new shoppingCart();
//    	if(getCustomerId!=null) {
//    		data.setProduct_id(Product.getProduct_id());
//    		data.setProduct_name(Product.getProduct_name());
//    		data.setQuantity(Product.getQuantity()); 
//    		data.setTotalPrice(quantity);	
//    	}
//		return s_CartResp.save(data);
//	}
	
	@Override
	public shoppingCart save(shoppingCart ShoppingCart) {
		productSevericeImp Item=new productSevericeImp();
		product Product_data=Item.getProduct(ShoppingCart.getProduct_id());
		shoppingCart data =new shoppingCart();
		shoppingCart getshoppingCartId=getShoppingCart(ShoppingCart.getItem_id());
		if(true) {
			data.setItem_id(data.getItem_id());
			data.setProduct_id(Product_data.getProduct_id());
			data.setProduct_name(Product_data.getProduct_name());
			data.setQuantity(ShoppingCart.getQuantity());
			data.setTotalPrice(Product_data.getProduct_price()*ShoppingCart.getQuantity());
		}
		return s_CartResp.save(data);
	}
	
	@Override
	public shoppingCart removeItem(product Product, int quantity) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public shoppingCart getTotalCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<product> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public shoppingCart getItemCount(product Product) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public shoppingCart addItem(shoppingCart product) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
