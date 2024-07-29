package com.example.recipe_api;

import com.example.recipe_api.mapper.RecipeMapper;
import com.example.recipe_api.models.Recipe;
import com.example.recipe_api.models.dto.RecipeDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeMapperTests {
    @Autowired
    private RecipeMapper recipeMapper = Mappers.getMapper(RecipeMapper.class);

    @Test
    public void testToRecipeDTO() {
        Recipe recipe = new Recipe(1L, "Pasta", "Boil water", 10, true, false, true, null, null);
        RecipeDTO recipeDTO = recipeMapper.toRecipeDTO(recipe);

        assertEquals(recipe.getId(), recipeDTO.getId());
        assertEquals(recipe.getName(), recipeDTO.getName());
        assertEquals(recipe.getInstructions(), recipeDTO.getInstructions());
        assertEquals(recipe.getCookingTimeInMinutes(), recipeDTO.getCookingTimeInMinutes());
        assertEquals(recipe.isVegan(), recipeDTO.isVegan());
        assertEquals(recipe.isNutFree(), recipeDTO.isNutFree());
        assertEquals(recipe.isGlutenFree(), recipeDTO.isGlutenFree());
    }
}
