package org.example.scalar1.serviceInterfaces;

import org.example.scalar1.dtos.ProductResponseDTO;
import org.example.scalar1.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProduct(int id);
    Product addNewProduct(Product product);
    Product updateProduct(Product product,int id);
    String deleteProduct(int id);
    List<ProductResponseDTO> getProductsInCategory(String catName);
}
