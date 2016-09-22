package com.mytest.mytestapp.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gal EP on 15/09/2016.
 */
public class ProductListTemplate {

    private ArrayList<Category> categories;
    private HashMap<Product, Integer> productToQunatityMap;

    public ProductListTemplate() {
        this.categories = new ArrayList<>();
        this.productToQunatityMap = new HashMap<Product, Integer>();
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public HashMap<Product, Integer> getProductToQunatityMap() {
        return productToQunatityMap;
    }
}
