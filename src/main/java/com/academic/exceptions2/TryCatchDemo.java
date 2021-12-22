package main.java.com.academic.exceptions2;

/**
 * @author Ramesh Karuti
 *
 */

public class TryCatchDemo {
	public void demoExc() {
		int i = 10, j = 0, div;

		try {
			div = i / j;
			System.out.println("The division is " + div);
		} catch (Exception e) {
			System.out.println("You have entered divid by zero");
		}

		try {
			int sum = i + j;
			int sub = i - j;
			int mul = i * j;
			System.out.println("The sum is " + sum);
			System.out.println("The Sub is  " + sub);
			System.out.println("The mul is  " + mul);
		} catch (Exception e) {
			System.out.println("Exception occured ");
		}

		 finally{
		 System.out.println("This is in finally block ");
		 }
	}

	public static void main(String arg[]) {
		TryCatchDemo ed = new TryCatchDemo();
		ed.demoExc();
	}
}