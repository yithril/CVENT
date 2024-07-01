package org.example;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150.00, false, false);
        Room room2 = new Room(1, 100.00, true, false);

        System.out.println("Room 1: Beds: " + room1.getNumberOfBeds() + ", Price: $" + room1.getPrice() + ", Available: " + room1.isAvailable());
        System.out.println("Room 2: Beds: " + room2.getNumberOfBeds() + ", Price: $" + room2.getPrice() + ", Available: " + room2.isAvailable());

        Reservation reservation1 = new Reservation("king", 3, true);
        Reservation reservation2 = new Reservation("double", 2, false);

        System.out.println("Reservation 1: Room Type: " + reservation1.getRoomType() + ", Price per Night: $" + reservation1.getPrice() + ", Total: $" + reservation1.getReservationTotal());
        System.out.println("Reservation 2: Room Type: " + reservation2.getRoomType() + ", Price per Night: $" + reservation2.getPrice() + ", Total: $" + reservation2.getReservationTotal());

        Employee employee1 = new Employee(1, "John Doe", "Engineering", 30.00, 45);
        Employee employee2 = new Employee(2, "Jane Smith", "Marketing", 25.00, 38);

        System.out.println("Employee 1: ID: " + employee1.getEmployeeId() + ", Name: " + employee1.getName() + ", Department: " + employee1.getDepartment() + ", Pay Rate: $" + employee1.getPayRate() + ", Hours Worked: " + employee1.getHoursWorked());
        System.out.println("Regular Hours: " + employee1.getRegularHours() + ", Overtime Hours: " + employee1.getOvertimeHours() + ", Total Pay: $" + employee1.getTotalPay());

        System.out.println("Employee 2: ID: " + employee2.getEmployeeId() + ", Name: " + employee2.getName() + ", Department: " + employee2.getDepartment() + ", Pay Rate: $" + employee2.getPayRate() + ", Hours Worked: " + employee2.getHoursWorked());
        System.out.println("Regular Hours: " + employee2.getRegularHours() + ", Overtime Hours: " + employee2.getOvertimeHours() + ", Total Pay: $" + employee2.getTotalPay());
    }
}