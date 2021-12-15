package main.java.com.academic.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo implements ICollections {

	Map<String, String> map = new HashMap<>();

	@Override
	public void setData(String key, String value) {
		map.put(key, value);

	}

	@Override
	public void printData() {

		map.forEach((k, v) -> {
			System.out.println("Hash Map Key : " + k + " Value " + v);
		});
	}

}
