package org.example.scalar1.serviceImp;

import org.example.scalar1.models.Category;
import org.example.scalar1.serviceInterfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class CategoriesServiceImpl implements CategoryService {

    @Autowired
    private RestTemplateBuilder restTemplate;

    @Override
    public List<String> getAllCategories() {
        String apiUrl = "https://fakestoreapi.com/products/categories";
        return List.of(Objects.requireNonNull(restTemplate.build().getForObject(apiUrl, String[].class)));
    }
}
