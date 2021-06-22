package ru.geekbrains.spring;

import java.util.List;

public interface CRUD {
    List<Product> get();
    Product getInd(int ind);
    void add(Product prod);
    boolean del(Product prod);
    void setInd(int ind,Product prod);
}
