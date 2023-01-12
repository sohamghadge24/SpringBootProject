package com.springBootproject.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootproject.SuperMarket.Entities.Customer;

@Repository
public interface CustomerResp extends JpaRepository<Customer, Long> { }
