package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService){
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getSuppliers() {
        return supplierService.getSuppliers();
    }

    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier){
        return supplierService.createSupplier(supplier);
    }
}