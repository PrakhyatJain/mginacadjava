package main.java.com.academic.collections2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Ramesh Karuti
 *
 */
public class IteratorDemo {
	void demoIterator(){
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(2);
		Iterator i = l.iterator();
		System.out.println("Array list containt is ");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args) {
		IteratorDemo id = new IteratorDemo();
		id.demoIterator();
	}

}
