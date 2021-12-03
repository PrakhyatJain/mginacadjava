package main.java.com.academic.layeredarchitecture.arithoperations.controller;

import java.util.Scanner;

import main.java.com.academic.layeredarchitecture.arithoperations.constants.ProjectConstants;
import main.java.com.academic.layeredarchitecture.arithoperations.service.ArithmeticService;

public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArithmeticService service = new ArithmeticService();

		System.out.println("Welcome to arithmetic Operations");
		System.out.println("1. Add, 2. Sub, 3. Multiply, 4. Division");
		System.out.println("Please enter your choice");

		String choice = scanner.nextLine();

		System.out.println("Please enter the first value");

		float valueOne = Float.parseFloat(scanner.nextLine());

		System.out.println("Please enter the second value");

		float valueTwo = Float.parseFloat(scanner.nextLine());

		switch (choice) {
		case ProjectConstants.ADD:
			System.out.println("Addition result = " + service.add(valueOne, valueTwo));
			break;
		case ProjectConstants.SUB:
			System.out.println("Substraction result = " + service.substract(valueOne, valueTwo));
			break;
		case ProjectConstants.MUL:
			System.out.println("Multiplication result = " + service.multiply(valueOne, valueTwo));
			break;
		case ProjectConstants.DIV:
			System.out.println("Division result = " + service.divide(valueOne, valueTwo));
			break;
		}

		

	}

}
