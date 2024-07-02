package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();
        Ostrich ostrich = new Ostrich();

        //polymorphism
        List<Bird> birdList = new ArrayList<>();

        birdList.add(eagle);
        birdList.add(hawk);

        List<Flyable> flyingThings = new ArrayList<>();

        flyingThings.add(eagle);
        flyingThings.add(hawk);

        for(Bird bird : birdList){
            bird.chirp();
            //downcasting
            if(bird instanceof Eagle){
                ((Eagle) bird).hunt();
            }
        }
    }
}