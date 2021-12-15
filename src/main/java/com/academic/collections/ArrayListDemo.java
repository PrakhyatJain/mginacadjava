package main.java.com.academic.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo implements ICollections {

	private List<String> list = new ArrayList<>();

	@Override
	public void setData(String key, String value) {
		list.add(value);

	}

	@Override
	public void printData() {

		list.forEach(v -> {
			System.out.println("Array List Value : " + v);
			;
		});

	}

}
