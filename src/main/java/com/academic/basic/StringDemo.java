package main.java.com.academic.basic;

public class StringDemo {
	/**
	 * @author Ramesh Karuti
	 * 
	 */
	public static void main(String[] args) {
		String s = " Hello";
		System.out.println(" String is " + s);
		s.concat("world");
		System.out.println(s.toUpperCase());
		System.out.println(" String upper case " + s);

		String s2 = s.toUpperCase();
		System.out.println(" String s2 " + s2);

		for (int i = 0; i <= 10; i++) {
			System.out.print(" " + (int) (Math.random() * 100));
		}

		Float i = new Float(12.2);
		byte b = i.byteValue();
		System.out.println(" Byte " + b);
		int ii = i.intValue();
		System.out.println(" Int " + ii);
		float f = i.floatValue();
		System.out.println(" Float " + f);
	}

}
