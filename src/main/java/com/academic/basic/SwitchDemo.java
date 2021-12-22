package main.java.com.academic.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchDemo {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the day code 1 to 7 ");
		String s = br.readLine();
		int day = Integer.parseInt(s);
		switch (day) {

		case 7:
			System.out.println("Satrday");
			break;
		case 6:
			System.out.println("Frieday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 3:
			System.out.println("Tuseday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No such day");

		}
	}

}
