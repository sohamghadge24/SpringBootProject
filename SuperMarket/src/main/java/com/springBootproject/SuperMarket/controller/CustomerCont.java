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

import com.springBootproject.SuperMarket.Entities.Customer;
import com.springBootproject.SuperMarket.services.CustomerService;

@RestController
@RequestMapping("/customer-details")
public class CustomerCont {
		@Autowired
		private CustomerService customerService;
		
		@GetMapping("/getDetailById/{id}")
		public Customer getData(@PathVariable("id") Long id) { 
			return customerService.getCustomer(id);}
		
		@PostMapping("/save")
		public ResponseEntity<?> saveOrder(@RequestBody() Customer customer) {
			Customer dbCustomer = customerService.saveCustomer(customer);
		return ResponseEntity.ok().body(dbCustomer);
		}
		@PutMapping("/updataData")
		public Customer updatedata(@RequestBody() Customer customer) {
			return customerService.updateCustomer(customer);
			}
		@DeleteMapping("/data/{id}")
			public String deletedate(@PathVariable("id") Long id) {
			Customer data = customerService.getCustomer(id);
			Boolean test=customerService.deleteCustomer(id);
			return (data!=null)?(test)?"deleted sucess":"no id found":"no data found";
			}

}


