package com.mytest.mytestapp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gal EP on 15/09/2016.
 */
public class ProductList {

    private String title;
    private HashMap<Product, Integer> productToQuantity;
    private Date creationDate;
    private ArrayList<Category> categories;

    public ProductList(String title) {
        this.title = title;
        this.creationDate = new Date();
        this.productToQuantity = new HashMap<Product, Integer>();
        this.categories = new ArrayList<Category>();
    }

    public HashMap<Product, Integer> getProductToQuantity() {
        return productToQuantity;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
