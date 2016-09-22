package com.mytest.mytestapp.models;

import java.util.UUID;

/**
 * Created by Gal EP on 15/09/2016.
 */
public class Product {

    private UUID id;
    private String title;
    private String remarks;

    public Product(UUID id, String title, String remarks) {
        this.id = id;
        this.title = title;
        this.remarks = remarks;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
