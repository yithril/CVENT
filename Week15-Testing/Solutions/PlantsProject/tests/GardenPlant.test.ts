import { GardenPlant } from "../src/GardenPlant";

describe('GardenPlant', () => {
    test('should initialize with given growthRate and currentHeight as 0', () => {
        const plant = new GardenPlant(2);
        expect(plant.growthRate).toBe(2);
        expect(plant.currentHeight).toBe(0);
    });

    test('should increase currentHeight by growthRate when watered', () => {
        const plant = new GardenPlant(2);
        plant.water();
        expect(plant.currentHeight).toBe(2);
    });

    test('should reduce currentHeight by 0.5 when pruned, not going below 1.0', () => {
        const plant = new GardenPlant(2);
        plant.currentHeight = 10;
        plant.prune();
        expect(plant.currentHeight).toBeCloseTo(9.5);

        plant.currentHeight = 1;
        plant.prune();
        expect(plant.currentHeight).toBe(1);
    });
});