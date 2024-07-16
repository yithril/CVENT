package com.example.resources;


import com.example.core.Recipe;
import com.example.db.RecipeDAO;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/recipes")
@Produces({MediaType.APPLICATION_JSON})
public class RecipeResource {
    private final RecipeDAO recipeDAO;

    public RecipeResource(SqlSessionFactory sqlSessionFactory){
        this.recipeDAO = new RecipeDAO(sqlSessionFactory);
    }

    @GET
    public List<Recipe> getAllRecipes(){
        return recipeDAO.getAllRecipes();
    }

    @GET
    @Path("/{id}")
    public Recipe getRecipeById(@PathParam("id") Long id){
        return recipeDAO.getRecipeId(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createRecipe(@Valid Recipe recipe) {
        Recipe createdRecipe = recipeDAO.insertRecipe(recipe);
        return Response.status(Response.Status.CREATED).entity(createdRecipe).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateRecipe(@PathParam("id") Long id, @Valid Recipe recipe) {
        recipe.setId(id);
        Recipe updatedRecipe = recipeDAO.updateRecipe(recipe);
        return Response.ok(updatedRecipe).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteRecipe(@PathParam("id") Long id) {
        recipeDAO.deleteRecipe(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @GET
    @Path("/search")
    public List<Recipe> searchRecipes(@QueryParam("name") String name, @QueryParam("description") String description) {
        return recipeDAO.searchRecipes(name, description);
    }
}
