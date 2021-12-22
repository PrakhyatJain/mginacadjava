package main.java.com.academic.collections2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @author Ramesh Karuti
 *
 */

public class CollectionsDemo {

	void demoArrayList() {
		ArrayList al = new ArrayList();
		al.add("vivek");
		al.add("rose");
		al.add("ramesh");
		al.add("mallu");

		System.out.println("Array List Containtent ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Name is " + al.get(i));
		}
	}

	void demoLinkedList() {
		LinkedList al = new LinkedList();
		al.add("vivek");
		al.add("rose");
		al.add("ramesh");
		al.add("mallu");

		System.out.println("Linked List Containtent ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Name is " + al.get(i));
		}
	}

	void demoVector() {
		Vector<String> al = new Vector<String>();
		al.add("vivek");
		al.add("rose");
		al.add("ramesh");
		al.add("mallu");
		System.out.println("Vector Containtent ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Name is " + al.get(i));
		}
	}

	void demoHashSet() {
		HashSet hs = new HashSet();
		hs.add("vivek");
		hs.add("ramesh");
		hs.add("ramesh");
		hs.add("mallu");
		System.out.println("Hash Set Containtent ");

		Iterator i = hs.iterator();
		while(i.hasNext()){
			String s = (String) i.next();
			System.out.println("Names are "+s);
		}
	}

	void demoTreeSet() {
		TreeSet ts = new TreeSet();
		ts.add("vivek");
		ts.add("rose");
		ts.add("ramesh");
		ts.add("rose");
		ts.add("abhi");
		System.out.println("Tree Set Containtent ");
		Iterator i = ts.iterator();
		while (i.hasNext()) {
			String s =  (String) i.next();
			System.out.println("Names are " + s);

		}
	}

	public static void main(String ar[]) {
		
		CollectionsDemo cd = new CollectionsDemo();
		cd.demoArrayList();
		cd.demoLinkedList();
		cd.demoVector();
		cd.demoHashSet();
		cd.demoTreeSet();
	}
}
