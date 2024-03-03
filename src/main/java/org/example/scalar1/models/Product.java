package org.example.scalar1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String imageUrl;
    private Category category;

}
