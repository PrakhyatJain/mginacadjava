package main.java.com.academic.collections2;

import java.util.ArrayList;

public class InfiniteCollectionDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for(long i=0;i<=99999;i++){
			al.add(i);
		}
		System.out.println("List size "+al);
	}
}
