/**
 * 
 */
package main.java.com.academic.basic;

/**
 * @author Ramesh Karuti
 *
 */
public class FibonaciDemo {

	/**
	 * @param args
	 */
	void oddDemo(){
		int a=-1, b=1, sum=0;
		System.out.println("Fibbonaci Series is : ");
		for(int i=1;i<10;i++){
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonaciDemo o = new FibonaciDemo();
		o.oddDemo();
	}

}
