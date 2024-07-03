package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        Person person1 = new Person("John", new Address("Detroit"));
        Person person2 = new Person("Mary");

        System.out.println(person2.getAddress().getCity());

        Optional<String> emptyOptional = Optional.empty();
        Optional<Integer> integerBox = Optional.of(100);

        int someNumber = integerBox.get();

        //conditional logic
        if(integerBox.isEmpty()){

        }
    }
}
