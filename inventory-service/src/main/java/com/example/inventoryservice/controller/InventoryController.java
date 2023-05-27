package com.example.inventoryservice.controller;
import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/inventory")

@RequiredArgsConstructor

public class InventoryController {

    @Autowired
    private final InventoryRepository inventoryRepository;

    @GetMapping

    @ResponseStatus(HttpStatus.OK)

    public List<Inventory> findAll() {

        return inventoryRepository.findAll();

    }

    @PostMapping

    @ResponseStatus(HttpStatus.CREATED)

    public void createProduct(@RequestBody Inventory inventory) {

        inventoryRepository.save(inventory);

    }
}
