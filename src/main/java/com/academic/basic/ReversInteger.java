/**
 * 
 */
package main.java.com.academic.basic;

/**
 * @author Ramesh Karuti
 *
 */
public class ReversInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0;
		int num=1034;
		System.out.println("Reverse Integer is ");
		while(num!=0){
			rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
	}

}
