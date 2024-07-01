package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List initialization
        List<Movie> movieList = new ArrayList<>() {{
            add(new Movie("John Wick", "Action"));
            add(new Movie("Princess Bride", "Fantasy"));
        }};

        List<String> stringList = Arrays.asList("one", "two", "three");

        List<String> anotherStringList = List.of("blue", "green");

        Movie[] movielist = new Movie[] { new Movie("blah", "blah") };
    }
}