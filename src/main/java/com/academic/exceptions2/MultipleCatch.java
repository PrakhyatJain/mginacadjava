package main.java.com.academic.exceptions2;

/**
 * @author Ramesh Karuti
 *
 */


public class MultipleCatch {
	public static void main(String args[]){

		try {
			int l = 2;//Change the l to 0 you ll get dived by zero exception
			System.out.println("l = " + l);
			int b = 42 / l;
			System.out.println("after divide by zero = " + l);
			int arr[] = { 1 };
			arr[0] = 99;// Change tha array size location u ll get indiex out of bounds exception
			
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		finally{
			System.out.println("I am finally block ");
		}
		System.out.println("Try sum "+2+3);
	}
}

