package com.example.first_spring_app;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public void printMessage(){
        System.out.println("My bean is alive!");
    }
}
