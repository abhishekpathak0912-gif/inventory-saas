package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

    @JsonIgnore
    @ManyToOne
private Category category;

@JsonIgnore
@ManyToOne
private Supplier supplier;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @PositiveOrZero(message = "Stock cannot be negative")
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
    return category;
}

public void setCategory(Category category) {
    this.category = category;
}

public Supplier getSupplier() {
    return supplier;
}

public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
}
}