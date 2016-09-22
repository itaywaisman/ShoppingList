package com.mytest.mytestapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gal EP on 15/09/2016.
 */
public class Category {

    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void addProuct(Product product){
        if (products.contains(product)) return;

        products.add(product);
    }

    public void removeProduct(Product product) {
        if (!products.contains(product)) return;

        products.remove(product);
    }


}
