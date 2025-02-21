package com.whitecloak.training.inventory.controller.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class ItemForm {

    private String name;

    private Long categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
