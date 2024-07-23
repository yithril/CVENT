import { Plant } from "./Plant";

export function assessGrowth(plants: Plant[]): number {
    return plants.reduce((sum, plant) => sum + plant.currentHeight, 0);
}

export function waterPlants(plants: Plant[]): void {
    plants.forEach(plant => plant.water());
}