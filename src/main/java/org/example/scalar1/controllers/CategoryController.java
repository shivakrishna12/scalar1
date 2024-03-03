package org.example.scalar1.controllers;


import org.example.scalar1.models.Category;
import org.example.scalar1.serviceImp.CategoriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoriesServiceImpl categoriesService;

    @GetMapping("getAllCategories")
    public List<String> getAllCategories(){
        return categoriesService.getAllCategories();
    }
}
