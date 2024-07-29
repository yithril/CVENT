package com.example.recipe_api;

import com.example.recipe_api.models.dto.CreateRecipeDTO;
import com.example.recipe_api.services.RecipeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RecipeServiceTest extends BaseTestClass {

    @Autowired
    private RecipeService recipeService;

    @Test
    public void findAllRecipes_Succeed(){
        recipeService.createRecipe(new CreateRecipeDTO("recipeName", "recipeInstructions", 20, false, true, false));
        recipeService.createRecipe(new CreateRecipeDTO("recipeName2", "recipeInstructions", 25, true, true, false));

        assertEquals(2, recipeService.getAllRecipes().size());
    }

}
