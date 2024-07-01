package org.example;

import java.util.Arrays;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    //varargs
    public int add(int... numbers){
        return Arrays.stream(numbers).sum();
    }

    //overload the method
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public void overloadMethod(String a, int b){

    }

    public void overloadMethod(int a, String b){

    }
}
