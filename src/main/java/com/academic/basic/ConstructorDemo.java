/**
 * 
 */
package main.java.com.academic.basic;

/**
 * @author Ramesh Karuti
 * 
 */
public class ConstructorDemo {

	/**
	 * @param args
	 */
	static int x;
	public double add(int x, double y) {
		double c = x + y;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("X "+x);
		ConstructorDemo d = new ConstructorDemo();
		double result = d.add(10, 2.5);
		System.out.println("Test " + result);
	}

}
