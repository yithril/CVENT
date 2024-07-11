package com.example.recipe_api.services;

import com.example.recipe_api.mapper.RecipeMapper;
import com.example.recipe_api.models.Recipe;
import com.example.recipe_api.models.dto.RecipeDTO;
import com.example.recipe_api.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    @Autowired
    private RecipeMapper recipeMapper;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public List<RecipeDTO> getAllRecipes(){
        List<Recipe> recipes = this.recipeRepository.findAll();
        return recipes.stream().map(recipeMapper::toRecipeDTO).toList();
    }

    public Optional<Recipe> getRecipeById(Long id){
        var recipe = this.recipeRepository.findById(id);

        return recipe;
    }
}
