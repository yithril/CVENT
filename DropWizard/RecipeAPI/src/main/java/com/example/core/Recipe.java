package com.example.core;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Recipe {
    private Long id;
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    private String instructions;

    @Min(value = 1, message = "Cooking time must be at least 1 minute")
    private int cooking_time_in_minutes;

    @NotNull(message = "Vegan status cannot be null")
    private Boolean is_vegan;

    @NotNull(message = "Nut-free status cannot be null")
    private Boolean is_nut_free;

    @NotNull(message = "Gluten-free status cannot be null")
    private Boolean is_gluten_free;

    public Recipe(){

    }

    public Recipe(Long id, String name, String instructions, int cooking_time_in_minutes, Boolean is_vegan, Boolean is_nut_free, Boolean is_gluten_free) {
        this.id = id;
        this.name = name;
        this.instructions = instructions;
        this.cooking_time_in_minutes = cooking_time_in_minutes;
        this.is_vegan = is_vegan;
        this.is_nut_free = is_nut_free;
        this.is_gluten_free = is_gluten_free;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getCooking_time_in_minutes() {
        return cooking_time_in_minutes;
    }

    public void setCooking_time_in_minutes(int cooking_time_in_minutes) {
        this.cooking_time_in_minutes = cooking_time_in_minutes;
    }

    public Boolean getIs_vegan() {
        return is_vegan;
    }

    public void setIs_vegan(Boolean is_vegan) {
        this.is_vegan = is_vegan;
    }

    public Boolean getIs_nut_free() {
        return is_nut_free;
    }

    public void setIs_nut_free(Boolean is_nut_free) {
        this.is_nut_free = is_nut_free;
    }

    public Boolean getIs_gluten_free() {
        return is_gluten_free;
    }

    public void setIs_gluten_free(Boolean is_gluten_free) {
        this.is_gluten_free = is_gluten_free;
    }
}
