package com.springBootproject.SuperMarket.services;

import com.springBootproject.SuperMarket.Entities.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	
	Customer updateCustomer(Customer customer);
	
	Boolean deleteCustomer(Long  customer_id);
	
	Customer getCustomer(Long customer_id);
}
