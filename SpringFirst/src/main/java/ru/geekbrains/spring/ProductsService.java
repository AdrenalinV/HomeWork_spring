package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private CRUD productsWerehouse;

    public ProductsService(CRUD productsWerehouse) {
        this.productsWerehouse = productsWerehouse;
    }
    public double calculateAverageScore() {
        List<Product> products = this.productsWerehouse.get();
        if (products.size() == 0) {
            return 0;
        } else {
            double avg = 0;
            for (Product product : products) {
                avg+=product.getCost();
            }
            avg /= products.size();
            return avg;
        }
    }

    public int size(){
        return this.productsWerehouse.get().size();
    }

    public void addProduct(Product prod){
        this.productsWerehouse.add(prod);
    }
    public boolean deleteProduct(Product prod){
        return this.productsWerehouse.del(prod);
    }
    public void updateProductByInd(int ind,Product prod){
        this.productsWerehouse.setInd(ind,prod);
    }
    public Product getProductByInd(int ind){
        return this.productsWerehouse.getInd(ind);
    }
    public List<Product> allProducts(){
        return this.productsWerehouse.get();
    }


}
