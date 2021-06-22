package ru.geekbrains.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductsService werehouse = context.getBean("productsService", ProductsService.class);
        System.out.println("size="+werehouse.size());
        System.out.println("avg="+werehouse.calculateAverageScore());
        for (Product prod : werehouse.allProducts()) {
            System.out.println(prod);
        }
        werehouse.addProduct(new Product(werehouse.size(), "newProd",9.99));
        werehouse.updateProductById(0,new Product(9999,"update_Product",100.00));
        werehouse.deleteProduct(werehouse.getProductById(1));
        System.out.println("add update and delete product:");
        for (Product prod : werehouse.allProducts()) {
            System.out.println(prod);
        }

    }
}

