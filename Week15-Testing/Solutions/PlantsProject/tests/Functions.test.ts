import { Flower } from "../src/Flower";
import { assessGrowth, waterPlants } from "../src/Functions";
import { GardenPlant } from "../src/GardenPlant";

describe('functions', () => {
    test('assessGrowth should return the sum of currentHeight of all plants', () => {
        const plants = [
            new GardenPlant(2),
            new Flower(3, true)
        ];
        plants[0].water();
        plants[1].water();
        expect(assessGrowth(plants)).toBe(5);
    });

    test('waterPlants should water all plants, increasing their currentHeight', () => {
        const plants = [
            new GardenPlant(2),
            new Flower(3, false)
        ];
        waterPlants(plants);
        expect(plants[0].currentHeight).toBe(2);
        expect(plants[1].currentHeight).toBe(3);
    });
});


