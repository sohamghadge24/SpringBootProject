package com.springBootproject.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootproject.SuperMarket.Entities.shoppingCart;

@Repository
public interface shoppingCartResp extends JpaRepository<shoppingCart, Long> { }

