package com.example.core;

import javax.validation.constraints.NotEmpty;

public class Recipe {
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;
    private int cookingTimeInMinutes;
    private boolean isVegan;
    private boolean isNutFree;
    private boolean isGlutenFree;

    public Recipe(){

    }

    public Recipe(Long id, String name, String description, int cookingTimeInMinutes, boolean isVegan, boolean isNutFree, boolean isGlutenFree) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cookingTimeInMinutes = cookingTimeInMinutes;
        this.isVegan = isVegan;
        this.isNutFree = isNutFree;
        this.isGlutenFree = isGlutenFree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCookingTimeInMinutes() {
        return cookingTimeInMinutes;
    }

    public void setCookingTimeInMinutes(int cookingTimeInMinutes) {
        this.cookingTimeInMinutes = cookingTimeInMinutes;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isNutFree() {
        return isNutFree;
    }

    public void setNutFree(boolean nutFree) {
        isNutFree = nutFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}
