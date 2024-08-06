import { useEffect, useState } from "react";
import { NutritionInfo } from "../../models/NutritionInfo";
import { getNutritionInfo } from "../../services/NutritionInfoService";

interface NutritionInfoCardProps {
    query: string;
  }
  
  const NutritionInfoCard: React.FC<NutritionInfoCardProps> = ({ query }) => {
    const [nutritionInfo, setNutritionInfo] = useState<NutritionInfo | null>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);
    const [collapsed, setCollapsed] = useState(true);
  
    useEffect(() => {
        if (!query) {
          setError('Recipe name is not available.');
          setLoading(false);
          return;
        }
    
        const fetchNutritionInfo = async () => {
          try {
            const info = await getNutritionInfo(query);
            setNutritionInfo(info);
            setLoading(false);
          } catch (err) {
            setError('Failed to fetch nutrition information.');
            setLoading(false);
          }
        };
    
        fetchNutritionInfo();
      }, [query]);
  
    const toggleCollapse = () => setCollapsed(!collapsed);
  
    if (loading) {
      return <div>Loading...</div>;
    }
  
    if (error) {
      return <div>{error}</div>;
    }
  
    return (
      <div className="nutrition-info-card">
        <button className="btn btn-link" onClick={toggleCollapse}>
          {collapsed ? 'Show Nutrition Info' : 'Hide Nutrition Info'}
        </button>
        {!collapsed && nutritionInfo && (
          <div className="card">
            <div className="card-body">
              <h5 className="card-title">{nutritionInfo.name}</h5>
              <p className="card-text">Total Fat: {nutritionInfo.fat_total_g}g</p>
              <p className="card-text">Saturated Fat: {nutritionInfo.fat_saturated_g}g</p>
              <p className="card-text">Fiber: {nutritionInfo.fiber_g}g</p>
              <p className="card-text">Sugar: {nutritionInfo.sugar_g}g</p>
            </div>
          </div>
        )}
      </div>
    );
  };
  
  export default NutritionInfoCard;