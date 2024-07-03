package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peopleDatabase = PersonDatabase.getPersons();

        //You don't always have to print to the console, but it could be helpful for testing!
        // 1. Print the full names of all people.
        peopleDatabase.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .forEach(System.out::println);

        // 2. Calculate the average yearly income of all people.
        double averageIncome = peopleDatabase.stream()
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0.0);

        // 3. List the professions of people living in Texas.
        List<String> professionsInTexas = peopleDatabase.stream()
                .filter(person -> person.getState().equals("Texas"))
                .map(Person::getProfession)
                .toList();

        // 4. Find the person with the highest income.
        Person highestIncomePerson = peopleDatabase.stream()
                .max(Comparator.comparingDouble(Person::getYearlyIncome))
                .orElse(null);

        // 5. Count the number of people living in California.
        long countInCalifornia = peopleDatabase.stream()
                .filter(person -> person.getState().equals("California"))
                .count();

        // 6. Create a list of people who are not teachers.
        List<Person> nonTeachers = peopleDatabase.stream()
                .filter(person -> !person.getProfession().equals("Teacher"))
                .toList();

        // 7. Find the total income of all doctors.
        double totalIncomeOfDoctors = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Doctor"))
                .mapToDouble(Person::getYearlyIncome)
                .sum();

        // 8. Print the names of people with an income higher than $100_000.
        peopleDatabase.stream()
                .filter(person -> person.getYearlyIncome() > 100000)
                .forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

        // 9. Find the average income of engineers.
        double averageIncomeOfEngineers = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Engineer"))
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0.0);

        // 10. List the first names of people whose last name starts with 'S'.
        List<String> firstNamesWithS = peopleDatabase.stream()
                .filter(person -> person.getLastName().startsWith("S"))
                .map(Person::getFirstName)
                .toList();

        // 11. List the last names of all people who have a yearly income greater than $75,000 and live in Florida.
        List<String> lastNamesInFlorida = peopleDatabase.stream()
                .filter(person -> person.getYearlyIncome() > 75000 && person.getState().equals("Florida"))
                .map(Person::getLastName)
                .toList();

        // 12. Find the average income of people whose profession is 'Teacher' or 'Doctor'.
        double averageIncomeOfTeachersAndDoctors = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Teacher") || person.getProfession().equals("Doctor"))
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0.0);

        // 13. Print the names of all people who live in New York.
        peopleDatabase.stream()
                .filter(person -> person.getState().equals("New York"))
                .forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

        // 14. Find the person with the lowest income.
        Person lowestIncomePerson = peopleDatabase.stream()
                .min(Comparator.comparingDouble(Person::getYearlyIncome))
                .orElse(null);

        // 15. List the full names of all chefs.
        List<String> chefs = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Chef"))
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .toList();

        // 16. Count the number of people who have a yearly income less than $50,000.
        long countIncomeLessThan50k = peopleDatabase.stream()
                .filter(person -> person.getYearlyIncome() < 50000)
                .count();

        // 17. List the professions of people living in Michigan.
        List<String> professionsInMichigan = peopleDatabase.stream()
                .filter(person -> person.getState().equals("Michigan"))
                .map(Person::getProfession)
                .toList();

        // 18. Find the total income of all scientists.
        double totalIncomeOfScientists = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Scientist"))
                .mapToDouble(Person::getYearlyIncome)
                .sum();

        // 19. Print the names of people who live in states starting with the letter 'C'.
        peopleDatabase.stream()
                .filter(person -> person.getState().startsWith("C"))
                .forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

        // 20. Find the average income of farmers.
        double averageIncomeOfFarmers = peopleDatabase.stream()
                .filter(person -> person.getProfession().equals("Farmer"))
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0.0);
    }
}