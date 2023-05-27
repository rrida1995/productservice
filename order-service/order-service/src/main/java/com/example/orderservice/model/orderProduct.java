package com.example.orderservice.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;

import lombok.NoArgsConstructor;

@AllArgsConstructor

@NoArgsConstructor

@Builder

@Data

@Entity
@Table(name = "order_product")
public class orderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long qty;

    private Long id_product;
}