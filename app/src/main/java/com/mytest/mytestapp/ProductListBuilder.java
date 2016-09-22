package com.mytest.mytestapp;

import com.mytest.mytestapp.models.Category;
import com.mytest.mytestapp.models.Product;
import com.mytest.mytestapp.models.ProductList;
import com.mytest.mytestapp.models.ProductListTemplate;

import java.util.Map;

/**
 * Created by Gal EP on 15/09/2016.
 */
public class ProductListBuilder {

    public ProductList createNewList(String title) {
        ProductList list = new ProductList(title);

        return list;
    }

    public ProductList createNewList(String title, ProductListTemplate productListTemplate) {
        ProductList list = new ProductList(title);

        for (Category category : productListTemplate.getCategories()){
            list.getCategories().add(category);
        }

        for (Map.Entry<Product,Integer> entry : productListTemplate.getProductToQunatityMap().entrySet()) {
            list.getProductToQuantity().put(entry.getKey(), entry.getValue());
        }
        
        return list;
    }
}
