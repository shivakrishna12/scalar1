package org.example.scalar1.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
