import { Recipe } from "../models/Recipe";
import recipeApiInstance from "../utils/RecipeApiInstance";

export const getAllRecipes = async (): Promise<Recipe[]> => {
    try {
      const response = await recipeApiInstance.get<Recipe[]>('/recipe');
      return response.data;
    } catch (error) {
      console.error('Failed to fetch recipes:', error);
      throw error;
    }
  };
  
  export const getRecipeById = async (id: number): Promise<Recipe> => {
    try {
      const response = await recipeApiInstance.get<Recipe>(`/recipe/${id}`);
      return response.data;
    } catch (error) {
      console.error(`Failed to fetch recipe with ID ${id}:`, error);
      throw error;
    }
  };