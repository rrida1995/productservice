package com.example.orderservice.repository;

import com.example.orderservice.model.orderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository("orderRepository")
public interface orderRepository extends JpaRepository<orderProduct,String >{
}
