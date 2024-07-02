package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            //System.out.println(20 / 0);

            //int[] intArray = new int[] { 1, 2, 3};

            //System.out.println(intArray[6]);

            String blah = null;
            blah.toLowerCase();
        }
        catch(ArithmeticException ex){
            System.out.println("Cant divide by zero sorry try again.");
        }
        catch(NullPointerException ex){
            System.out.println("Tried to do something with a null value");
        }
        catch(Exception ex){
            System.out.println("This is a general exception");
        }
    }
}