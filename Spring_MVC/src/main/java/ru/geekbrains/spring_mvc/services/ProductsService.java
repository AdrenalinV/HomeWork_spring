package ru.geekbrains.spring_mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring_mvc.models.Product;
import ru.geekbrains.spring_mvc.repositories.ProductRepository;

import java.util.List;

@Component
public class ProductsService {
    private ProductRepository products;

    @Autowired
    public ProductsService(ProductRepository products) {
        this.products = products;
    }

    public List<Product> getAll() {
        return this.products.get();
    }

    public Product findById(int Id) {
        return this.products.findByID(Id);
    }
}
