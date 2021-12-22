package main.java.com.academic.exceptions;

public class DivideByZero {

	public void compute() {

		boolean flag = true;

		int num = 10;
		int den = 5;

		try {
			System.out.println("Division result: " + num / den);
		} catch (ArithmeticException ex) {

			System.out.println("Exception occured, Cannot divide by zero");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Division was successful!");
			} else {
				System.out.println("Division was unsuccessful.!");
			}
		}

	}

}
