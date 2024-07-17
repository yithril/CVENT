package com.example.mapper;

import com.example.core.Recipe;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RecipeMapper {
    @Select("SELECT * FROM recipe WHERE id = #{id}")
    Recipe getRecipeById(Long id);

    @Select("SELECT * FROM recipe")
    List<Recipe> getAllRecipes();

    @Insert("INSERT INTO recipe (name, instructions) VALUES (#{name}, #{instructions})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertRecipe(Recipe recipe);

    @Insert("INSERT INTO recipe (name, instructions) VALUES (#{name}, #{instructions})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void updateRecipe(Recipe recipe);

    @Delete("DELETE FROM recipe WHERE id = ${id}")
    void deleteRecipe(Long id);

    @Select({
            "<script>",
            "SELECT * FROM recipe",
            "WHERE 1=1",
            "<if test='name != null'>",
            "AND name LIKE CONCAT('%', #{name}, '%')",
            "</if>",
            "<if test='description != null'>",
            "AND description LIKE CONCAT('%', #{description}, '%')",
            "</if>",
            "</script>"
    })
    List<Recipe> searchRecipes(@Param("name") String name, @Param("description") String description);

}
