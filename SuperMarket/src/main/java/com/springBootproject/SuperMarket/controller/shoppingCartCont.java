package com.springBootproject.SuperMarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootproject.SuperMarket.Entities.product;
import com.springBootproject.SuperMarket.Entities.shoppingCart;
import com.springBootproject.SuperMarket.services.shoppingCartService;


@RestController
@RequestMapping("/ShoppingCart")
public class shoppingCartCont {
	
	@Autowired
	private shoppingCartService ShoppingCartService;

	@GetMapping("/getDetailById/{id}")
	public shoppingCart getData(@PathVariable("id") Long id) { 
		return ShoppingCartService.getShoppingCart(id);
		}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveOrder(@RequestBody()shoppingCart ShoppingCart) {
	shoppingCart dbproduct = ShoppingCartService.save(ShoppingCart);
	return ResponseEntity.ok().body(dbproduct);
	}
	
//	@PutMapping("/updataData")
//	public shoppingCart updatedata(@RequestBody() shoppingCart Product ) {
//		return ShoppingCartService.updateProduct(Product);
//		}
//	@DeleteMapping("/data/{id}")
//		public String deletedate(@PathVariable("id") Long id) {
//		shoppingCart data = ShoppingCartService.getProduct(id);
//		Boolean test=ShoppingCartService.deleteProduct(id);
//		return (data!=null)?(test)?"deleted sucess":"no id found":"no data found";
//		}

}
