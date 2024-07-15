package com.example.db;

import com.example.core.Recipe;
import com.example.mapper.RecipeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RecipeDAO {
    private final SqlSessionFactory sqlSessionFactory;

    public RecipeDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public Recipe getRecipeId(Long id){
        try(SqlSession session = sqlSessionFactory.openSession()){
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            return mapper.getRecipeById(id);
        }
    }

    public List<Recipe> getAllRecipes() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            return mapper.getAllRecipes();
        }
    }

    public Recipe insertRecipe(Recipe recipe) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            mapper.insertRecipe(recipe);
            session.commit();
            return recipe;
        }
    }

    public Recipe updateRecipe(Recipe recipe) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            mapper.updateRecipe(recipe);
            session.commit();
            return recipe;
        }
    }

    public void deleteRecipe(Long id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            mapper.deleteRecipe(id);
            session.commit();
        }
    }

    public List<Recipe> searchRecipes(String name, String description) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            RecipeMapper mapper = session.getMapper(RecipeMapper.class);
            return mapper.searchRecipes(name, description);
        }
    }
}
