/**
 * 
 */
package main.java.com.academic.collections2;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Ramesh Karuti
 *
 */
public class EnumerationDemo {

	void demoEnum(){
		Hashtable ht = new Hashtable();
		ht.put("10","abhi");
		ht.put("20","pinky");
		ht.put("30","chittu");
		ht.put("40","vivek");
		ht.put("50","ram");
		System.out.println("The hastable containt is ");
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			String x = (String) e.nextElement();
			System.out.println("Key "+x);
			System.out.println("Value "+ht.get(x));
		}
	}
	
	public static void main(String[] args) {
		EnumerationDemo e = new EnumerationDemo();
		e.demoEnum();
	}

}
