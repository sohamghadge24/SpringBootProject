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
import com.springBootproject.SuperMarket.services.productService;

@RestController
@RequestMapping("/product-details")
public class productCont {
	
	@Autowired
	private productService ProductService;

	@GetMapping("/getDetailById/{id}")
	public product getData(@PathVariable("id") Long id) { 
		return ProductService.getProduct(id);
		}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveOrder(@RequestBody() product Product) {
		product dbproduct = ProductService.saveProduct(Product);
	return ResponseEntity.ok().body(dbproduct);
	}
	@PutMapping("/updataData")
	public product updatedata(@RequestBody() product Product ) {
		return ProductService.updateProduct(Product);
		}
	@DeleteMapping("/data/{id}")
		public String deletedate(@PathVariable("id") Long id) {
		product data = ProductService.getProduct(id);
		Boolean test=ProductService.deleteProduct(id);
		return (data!=null)?(test)?"deleted sucess":"no id found":"no data found";
		}

}
