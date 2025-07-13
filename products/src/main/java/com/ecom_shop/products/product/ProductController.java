package com.ecom_shop.products.product;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/show-all-products")
    public ResponseEntity<List<Product>> showAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/add-product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product saved = productService.addProduct(product);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updated) {
        Product product = productService.updateProductById(id, updated);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update-by-name")
    public ResponseEntity<Product> updateProductByName(@RequestParam String name, @RequestBody Product updated) {
        Product product = productService.updateProductByName(name, updated);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/delete-by-name")
    public ResponseEntity<Void> deleteProductByName(@RequestParam String name) {
        productService.deleteProductByName(name);
        return ResponseEntity.noContent().build();
    }



}
