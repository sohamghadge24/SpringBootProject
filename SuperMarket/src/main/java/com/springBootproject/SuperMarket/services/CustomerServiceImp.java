package com.springBootproject.SuperMarket.services;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.springBootproject.SuperMarket.Entities.Customer;
import com.springBootproject.SuperMarket.Repository.CustomerResp;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private CustomerResp customerResp;
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
	return customerResp.save(customer);
	}
	
	@Override
	public Customer updateCustomer(Customer customer) {
    	Customer getCustomerId=getCustomer(customer.getCustomer_id());
    	Customer data =new Customer();
    	if(getCustomerId!=null) {
    		data.setCustomer_id(customer.getCustomer_id());
    		data.setAddress(customer.getAddress()); 
    		data.setName(customer.getName());	
    	}
		return customerResp.save(data);
	}

	@Override
	public Boolean deleteCustomer(Long customer_id) {
		customerResp.deleteById(customer_id);
		return true;
	}

	@Override
	public Customer getCustomer(Long customer_id) {
		// TODO Auto-generated method stub
		return customerResp.findById(customer_id).orElseThrow(()->new RuntimeException(customer_id+" not found"));
	}

}
