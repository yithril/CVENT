import { GardenPlant } from "./GardenPlant";

export class Flower extends GardenPlant {
    hasThorns: boolean;

    constructor(growthRate: number, hasThorns: boolean = false) {
        super(growthRate);
        this.hasThorns = hasThorns;
    }

    prune(): void {
        if (this.hasThorns) {
            if (this.currentHeight > 2) {
                this.currentHeight = Math.max(1, this.currentHeight - 1);
            }
        } else {
            super.prune();
        }
    }
}