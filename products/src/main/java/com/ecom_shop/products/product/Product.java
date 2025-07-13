package com.ecom_shop.products.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String category;

    private BigDecimal price;

//    private String description;
//
//    private int stock;
//
//    private boolean available;
}

