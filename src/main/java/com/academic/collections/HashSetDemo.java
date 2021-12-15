package main.java.com.academic.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo implements ICollections {

	private Set<String> set = new HashSet<>();

	@Override
	public void setData(String key, String value) {

		set.add(value);
	}

	@Override
	public void printData() {

		set.forEach(v -> {
			System.out.println("Hash Set Value : " + v);
		});

	}
}
