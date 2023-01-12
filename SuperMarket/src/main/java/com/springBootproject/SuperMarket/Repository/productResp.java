package com.springBootproject.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootproject.SuperMarket.Entities.product;

@Repository
public interface productResp extends JpaRepository<product, Long> { }
