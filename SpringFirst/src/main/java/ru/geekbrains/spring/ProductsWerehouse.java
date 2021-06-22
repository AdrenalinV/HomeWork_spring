package ru.geekbrains.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("werehouse")
public class ProductsWerehouse implements  CRUD{
    private List<Product> werehouse;

    @PostConstruct
    public void init(){
        Random r=new Random();
        this.werehouse=new ArrayList();
        for (int i = 0; i < 10; i++) {
            this.werehouse.add(new Product(i,"Product_"+i,100+(10* r.nextDouble())));
        }

    }

    @Override
    public List<Product> get() {
        return werehouse;
    }

    @Override
    public Product getInd(int ind) throws IndexOutOfBoundsException {
        if (ind<0 || ind>=this.werehouse.size()){
            throw new IndexOutOfBoundsException();
        }
        return this.werehouse.get(ind);
    }

    @Override
    public void add(Product prod) {
        this.werehouse.add(prod);
    }

    @Override
    public boolean del(Product prod) {
        return this.werehouse.remove(prod);
    }

    @Override
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
