package ru.geekbrains.spring_mvc.repositories;

import ru.geekbrains.spring_mvc.models.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class ProductRepository {
    private List<Product> werehouse;

    @PostConstruct
    public void init(){
        Random r=new Random();
        this.werehouse=new ArrayList();
        for (int i = 0; i < 10; i++) {
            this.werehouse.add(new Product(i,"Product_"+i,100+(10* r.nextDouble())));
        }

    }

    public List<Product> get() {
        return Collections.unmodifiableList(werehouse);
    }


    public Product getInd(int ind) throws IndexOutOfBoundsException {
        if (ind<0 || ind>=this.werehouse.size()){
            throw new IndexOutOfBoundsException();
        }
        return this.werehouse.get(ind);
    }


    public void add(Product prod) {
        this.werehouse.add(prod);
    }


    public boolean del(Product prod) {
        return this.werehouse.remove(prod);
    }

    public void setInd(int ind, Product prod) throws IndexOutOfBoundsException{
        if (ind<0 || ind>=this.werehouse.size()){
            throw new IndexOutOfBoundsException();
        }
        Product tmp;
        tmp=this.werehouse.get(ind);
        tmp.setCost(prod.getCost());
        tmp.setTitle(prod.getTitle());
    }
}
