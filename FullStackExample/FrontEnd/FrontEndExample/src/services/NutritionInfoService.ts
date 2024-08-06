import { NutritionInfo } from "../models/NutritionInfo";
import nutritionApiInstance from "../utils/NutritionApiInstance";

export const getNutritionInfo = async (query: string): Promise<NutritionInfo> => {
    try {
      const response = await nutritionApiInstance.get<NutritionInfo[]>(`?query=${query}`);
      return response.data[0];
    } catch (error) {
      console.error('Failed to fetch nutrition info:', error);
      throw error;
    }
  };