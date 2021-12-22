/**
 * 
 */
package main.java.com.academic.basic;

/**
 * @author Ramesh Karuti
 *
 */
public class PrimeNumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers are ");
		boolean flag;
		for(int i=1;i<=20;i++){
			flag=false;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(flag==false){
				System.out.println(i);
			}
		}
	}

}
