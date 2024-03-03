package org.example.scalar1.controllers;

import lombok.Getter;
import org.example.scalar1.dtos.ProductResponseDTO;
import org.example.scalar1.models.Product;
import org.example.scalar1.serviceImp.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;
    //curd operations
    @GetMapping("getAllProducts")
    public List<Product> getAllProducts(){
        return productServiceImpl.getAllProducts();
    }
    @GetMapping("getProduct/{id}")
    public Product getProduct(@PathVariable int id){
        return productServiceImpl.getProduct(id);
    }
    @PostMapping("addNewProduct")
    public Product addNewProduct(@RequestBody Product product){
        return productServiceImpl.addNewProduct(product);
    }
    @PutMapping("updateProduct/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable("id") int id){
        return productServiceImpl.updateProduct(product,id);
    }

    @DeleteMapping("deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        return productServiceImpl.deleteProduct(id);
    }
    @GetMapping("productsInCategory/{categoryName}")
    public List<ProductResponseDTO> getProductsInCategory(@PathVariable("categoryName") String name){

        return productServiceImpl.getProductsInCategory(name);
    }
}
