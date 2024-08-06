import { useEffect, useState } from "react";
import { Recipe } from "../../models/Recipe";
import { getAllRecipes } from "../../services/RecipeService";
import RecipeCard from "./RecipeCard";

const RecipeList: React.FC = () => {
    const [recipes, setRecipes] = useState<Recipe[]>([]);
  
    useEffect(() => {
      const fetchRecipes = async () => {
        try {
          const recipes = await getAllRecipes();
          setRecipes(recipes);
        } catch (error) {
          console.error('Failed to fetch recipes', error);
        }
      };
  
      fetchRecipes();
    }, []);
  
    return (
      <div className="container">
        <div className="row">
          {recipes.map((recipe) => (
            <RecipeCard key={recipe.id} recipe={recipe} />
          ))}
        </div>
      </div>
    );
  };
  
  export default RecipeList;