package ru.geekbrains.spring_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Product {
    private int id;
    private String title;
    private double cost;
}
