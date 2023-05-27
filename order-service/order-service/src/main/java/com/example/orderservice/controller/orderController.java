package com.example.orderservice.controller;
import com.example.orderservice.model.orderProduct;
import com.example.orderservice.repository.orderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/order")

@RequiredArgsConstructor
public class orderController {
    @Autowired
    private final orderRepository orderRepository;

    @GetMapping

    @ResponseStatus(HttpStatus.OK)

    public List<orderProduct> findAll() {

        return orderRepository.findAll();

    }

    @PostMapping

    @ResponseStatus(HttpStatus.CREATED)

    public void createProduct(@RequestBody orderProduct op) {

        orderRepository.save(op);

    }
}
