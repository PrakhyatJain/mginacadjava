package main.java.com.academic.collections2;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

/**
 * @author Ramesh Karuti
 *
 */
public class MapCollections {
	
	/**
	 * @param args
	 */
	
	void demoHashTable() {
		Hashtable ht = new Hashtable();
		ht.put("9", "vivek");
		ht.put("2", "rose");
		ht.put("4", "marry");
		ht.put("5", "ullas");
		ht.put("7", "ram");

		Enumeration enm = ht.elements();
		System.out.println("Hash Table Containtent "+ht);

		while(enm.hasMoreElements()){
			String i = (String) enm.nextElement();
			System.out.println("Key :: "+i);
			System.out.println("Value :: "+ht.get(i));
		}
	}

	void demoHashMap() {
		HashMap hm = new HashMap();
		hm.put("1", "vivek");
		hm.put("3", "ram");
		hm.put("4", "marry");
		hm.put("2", "rose");
		hm.put("5", "ullas");
//		Enumeration enm = hm.elements();
//		System.out.println("Hash Map Containtent ");
//		while(enm.hasMoreElements()){
//			String i = (String) enm.nextElement();
//			System.out.println("Key :: "+i);
//			System.out.println("Value :: "+hm.get(i));
//		}

	}

	void demoTreeMap() {
		TreeMap tm = new TreeMap();
		tm.put(1, "vivek");
		tm.put(2, "rose");
		tm.put(4, "marry");
		tm.put(5, "ullas");
		tm.put(3, "ram");
		System.out.println("Tree Map Containtent ");
		
//		Enumeration enm = tm.elements();
//		System.out.println("Hash Map Containtent ");
//		while(enm.hasMoreElements()){
//			String i = (String) enm.nextElement();
//			System.out.println("Key :: "+i);
//			System.out.println("Value :: "+tm.get(i));
//		}

		for (int i = 1; i <= tm.size(); i++) {
			System.out.println("Name is " + tm.get(i));
		}
	}
	public static void main(String[] args) {
		MapCollections mc = new MapCollections();
		mc.demoHashMap();
		mc.demoHashTable();
		mc.demoTreeMap();
		
		
		HashMap hm = new HashMap();
		hm.put(0, "rose");
		hm.put(1, "tiger");
		hm.put(2, "ullu");
		System.out.println("*** "+hm.get(0));
	}
}
