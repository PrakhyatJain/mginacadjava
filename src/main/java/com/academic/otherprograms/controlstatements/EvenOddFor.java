package main.java.com.academic.otherprograms.controlstatements;

public class EvenOddFor {

	public void processEvenOddForLoop() {

		System.out.println("Using for loop...");

		System.out.println("Printing even numbers");
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("Printing odd numbers");
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}
	}

	public void processEvenOddWhileLoop() {

		System.out.println("Using while loop...");

		System.out.println("Printing even numbers");
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 2;
		}

		System.out.println("Printing odd numbers");
		i = 1;
		while (i < 10) {
			System.out.println(i);
			i = i + 2;
		}
	}

	public void processEvenOddDoWhileLoop() {

		System.out.println("Using do while loop...");

		System.out.println("Printing even numbers");
		int i = 0;

		do {
			System.out.println(i);
			i = i + 2;
		} while (i < 10);

		System.out.println("Printing odd numbers");
		i = 1;
		do {
			System.out.println(i);
			i = i + 2;
		} while (i < 10);
	}

}
