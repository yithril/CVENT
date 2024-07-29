package com.example.recipe_api.config;

import com.example.recipe_api.models.Recipe;
import com.example.recipe_api.repositories.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final RecipeRepository recipeRepository;

    public DataLoader(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        if (recipeRepository.count() == 0) {
            Recipe recipe1 = new Recipe();
            recipe1.setName("Spaghetti Carbonara");
            recipe1.setInstructions("Cook the spaghetti. Fry pancetta with garlic. Mix eggs and cheese. Combine everything.");
            recipe1.setCookingTimeInMinutes(30);
            recipe1.setVegan(false);
            recipe1.setNutFree(true);
            recipe1.setGlutenFree(false);
            recipe1.setCreatedDate(LocalDateTime.of(2024, 7, 11, 12, 0));
            recipe1.setLastModifiedDate(LocalDateTime.of(2024, 7, 11, 12, 0));

            Recipe recipe2 = new Recipe();
            recipe2.setName("Chicken Curry");
            recipe2.setInstructions("Cook chicken. Add spices and coconut milk. Simmer until cooked.");
            recipe2.setCookingTimeInMinutes(45);
            recipe2.setVegan(false);
            recipe2.setNutFree(true);
            recipe2.setGlutenFree(true);
            recipe2.setCreatedDate(LocalDateTime.of(2024, 7, 11, 12, 0));
            recipe2.setLastModifiedDate(LocalDateTime.of(2024, 7, 11, 12, 0));

            Recipe recipe3 = new Recipe();
            recipe3.setName("Caesar Salad");
            recipe3.setInstructions("Mix lettuce, croutons, and Parmesan. Add Caesar dressing.");
            recipe3.setCookingTimeInMinutes(15);
            recipe3.setVegan(true);
            recipe3.setNutFree(true);
            recipe3.setGlutenFree(true);
            recipe3.setCreatedDate(LocalDateTime.of(2024, 7, 11, 12, 0));
            recipe3.setLastModifiedDate(LocalDateTime.of(2024, 7, 11, 12, 0));

            Recipe recipe4 = new Recipe();
            recipe4.setName("Beef Stroganoff");
            recipe4.setInstructions("Cook beef and mushrooms. Add sour cream and serve over noodles.");
            recipe4.setCookingTimeInMinutes(40);
            recipe4.setVegan(false);
            recipe4.setNutFree(true);
            recipe4.setGlutenFree(false);
            recipe4.setCreatedDate(LocalDateTime.of(2024, 7, 11, 12, 0));
            recipe4.setLastModifiedDate(LocalDateTime.of(2024, 7, 11, 12, 0));

            Recipe recipe5 = new Recipe();
            recipe5.setName("Vegetable Stir-Fry");
            recipe5.setInstructions("Stir-fry mixed vegetables with soy sauce.");
            recipe5.setCookingTimeInMinutes(20);
            recipe5.setVegan(true);
            recipe5.setNutFree(true);
            recipe5.setGlutenFree(true);
            recipe5.setCreatedDate(LocalDateTime.of(2024, 7, 11, 12, 0));
            recipe5.setLastModifiedDate(LocalDateTime.of(2024, 7, 11, 12, 0));

            recipeRepository.save(recipe1);
            recipeRepository.save(recipe2);
            recipeRepository.save(recipe3);
            recipeRepository.save(recipe4);
            recipeRepository.save(recipe5);
        }
    }
}