import { Flower } from "../src/Flower";

describe('Flower', () => {
    test('should initialize with given growthRate and hasThorns, currentHeight as 0', () => {
        const flower = new Flower(3, true);
        expect(flower.growthRate).toBe(3);
        expect(flower.hasThorns).toBe(true);
        expect(flower.currentHeight).toBe(0);
    });

    test('should default hasThorns to false if not provided', () => {
        const flower = new Flower(3);
        expect(flower.hasThorns).toBe(false);
    });

    test('should increase currentHeight by growthRate when watered', () => {
        const flower = new Flower(3);
        flower.water();
        expect(flower.currentHeight).toBe(3);
    });

    test('should reduce currentHeight by 0.5 when pruned and hasThorns is false', () => {
        const flower = new Flower(3, false);
        flower.currentHeight = 10;
        flower.prune();
        expect(flower.currentHeight).toBeCloseTo(9.5);
    });

    test('should reduce currentHeight by 1 when pruned and hasThorns is true', () => {
        const flower = new Flower(3, true);
        flower.currentHeight = 10;
        flower.prune();
        expect(flower.currentHeight).toBeCloseTo(9);
    });

    test('should not reduce currentHeight below 1 when pruned', () => {
        const flower = new Flower(3, true);
        flower.currentHeight = 1;
        flower.prune();
        expect(flower.currentHeight).toBe(1);
    });
});