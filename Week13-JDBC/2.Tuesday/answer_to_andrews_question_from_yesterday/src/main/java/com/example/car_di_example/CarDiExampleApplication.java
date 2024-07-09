package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarDiExampleApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(CarDiExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CarFactory carFactory = context.getBean(CarFactory.class);

		Car gasCar = carFactory.createCar("gas");
		gasCar.drive();

		Car electricCar = carFactory.createCar("electric");
		electricCar.drive();
	}
}
