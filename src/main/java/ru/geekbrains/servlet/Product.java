package ru.geekbrains.servlet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    int id;
    String title;
    double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id=" + id + "\t"+
                " title=" + title + "\t" +
                " cost=" + cost;
    }
}
