package main.java.com.academic.exceptions;

public class VotingClass {
	
	public void vote(int age) throws InvalidAgeException {
		if(age <18) {
			throw new InvalidAgeException("Age is less than 18 therefore not eligible for voting");
		} else {
			System.out.println("Given age is valid for vote.");
		}
	}

}
