package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//So there are multiple things that implement Engine, this is the default one because of the
//@Primary annotation
@Component
@Primary
public class GasEngine implements Engine {
    private final OilFilter oilFilter;

    @Autowired
    public GasEngine(OilFilter oilFilter) {
        this.oilFilter = oilFilter;
    }

    @Override
    public void start() {
        oilFilter.filter();
        System.out.println("Starting gas engine...");
    }
}
