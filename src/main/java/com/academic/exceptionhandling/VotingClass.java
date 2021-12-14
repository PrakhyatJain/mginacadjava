package main.java.com.academic.exceptionhandling;

public class VotingClass {
	
	public void vote(int age) throws InvalidAgeException {
		if(age <18) {
			throw new InvalidAgeException("Age is less than 18 therefore voting not possible");
		} else {
			System.out.println("Given age is valid for vote.");
		}
	}

}
