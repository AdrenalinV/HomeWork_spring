package ru.geekbrains.spring;

import java.util.List;

public interface CRUD {
    List<Product> get();
    Product getID(int id);
    void add(Product prod);
    boolean del(Product prod);
    void setID(int id,Product prod);
}
