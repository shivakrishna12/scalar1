package org.example.scalar1.serviceImp;

import org.example.scalar1.dtos.ProductResponseDTO;
import org.example.scalar1.models.Product;
import org.example.scalar1.serviceInterfaces.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {
    private RestTemplate restTemplate;

    public ProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<Product> getAllProducts() {
        String apiUrl="https://fakestoreapi.com/products";
       return List.of(Objects.requireNonNull(restTemplate.getForObject(apiUrl, Product[].class)));
    }

    @Override
    public Product getProduct(int id) {
        String apiUrl="https://fakestoreapi.com/products/"+id;
        return restTemplate.getForObject(apiUrl,Product.class);
    }

    @Override
    public Product addNewProduct(Product product) {
        return restTemplate.postForObject("https://fakestoreapi.com/products",product,Product.class);
    }
    @Override
    public Product updateProduct(Product product,int id) {
         restTemplate.put("https://fakestoreapi.com/products/"+id,product);
         return restTemplate.getForObject("https://fakestoreapi.com/products/"+id,Product.class);
    }

    @Override
    public String deleteProduct(int id) {
        restTemplate.delete("https://fakestoreapi.com/products/" + id);
        return "product deleted Successfully";
    }

    @Override
    public List<ProductResponseDTO> getProductsInCategory(String catName) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject("https://fakestoreapi.com/products/category/"+catName, ProductResponseDTO[].class)));
    }

}
