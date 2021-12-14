package main.java.com.academic.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//Perform divide by zero
		DivideByZero divideByZero = new DivideByZero();
		divideByZero.compute();
		
		VotingClass votingClass = new VotingClass();
		int age = 15;
		try { 
			
			votingClass.vote(age);
		} catch (InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Age validation is completed.");
		}

	}
	
	

}
