package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository("InventoryRepository")
public interface InventoryRepository extends JpaRepository<Inventory,String > {

}
