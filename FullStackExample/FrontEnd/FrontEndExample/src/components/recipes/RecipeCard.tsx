import { Recipe } from "../../models/Recipe";
import NutritionInfoCard from "../nutritionInfo/NutritionInfoCard";

interface RecipeCardProps {
    recipe: Recipe;
  }
  
  const RecipeCard: React.FC<RecipeCardProps> = ({ recipe }) => {
    return (
      <div className="col-md-4 mb-4">
        <div className="card">
          <div className="card-body">
            <h5 className="card-title">{recipe.name}</h5>
            <p className="card-text">{recipe.instructions}</p>
            <p className="card-text">
              <small className="text-muted">Cooking Time: {recipe.cookingTimeInMinutes} minutes</small>
            </p>
            <p className="card-text">
              <small className="text-muted">{recipe.vegan ? 'Vegan' : 'Non-Vegan'}</small>
            </p>
            <NutritionInfoCard query={recipe.name} />
          </div>
        </div>
      </div>
    );
  };
  
  export default RecipeCard;