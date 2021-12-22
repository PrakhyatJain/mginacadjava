package main.java.com.academic.collections;

public class CollectionsMain {

	public static void main(String[] args) {

		// Array List
		ICollections alDemo = new ArrayListDemo();
		alDemo.setData(null, "Vivek");
		alDemo.setData(null, "Ramesh");
		alDemo.setData(null, "Prakhyat");
		alDemo.setData(null, "Satish");

		alDemo.printData();

		// Hash Set
		ICollections hsDemo = new HashSetDemo();
		hsDemo.setData(null, "Vivek");
		hsDemo.setData(null, "Ramesh");
		hsDemo.setData(null, "Prakhyat");
		hsDemo.setData(null, "Satish");
		hsDemo.setData(null, "Vivek"); // Duplicate value inserted
		hsDemo.setData(null, "Ramesh"); // Duplicate value inserted
		hsDemo.setData(null, "Prakhyat"); // Duplicate value inserted
		hsDemo.setData(null, "Satish"); // Duplicate value inserted

		hsDemo.printData();

		// Hash Map
		ICollections hmDemo = new HashMapDemo();
		hmDemo.setData("1", "Vivek"); // Duplicate value inserted
		hmDemo.setData("2", "Ramesh"); // Duplicate value inserted
		hmDemo.setData("3", "Prakhyat"); // Duplicate value inserted
		hmDemo.setData("4", "Satish"); // Duplicate value inserted

		hmDemo.printData();

	}

}
