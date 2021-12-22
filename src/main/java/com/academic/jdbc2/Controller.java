package main.java.com.academic.jdbc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

	/**
	 * @param args
	 * @throws IOException 
	 */
	void demoController() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter name : ");
		String inputName = br.readLine();
		String inputPass = br.readLine();
		boolean flag = false;
		//String inputName = "Rose";
		SelectDemo sd = new SelectDemo();
		flag = sd.selectDemo(inputName, inputPass);
		
		if(flag){
			System.out.println("Success ");
		}
		else{
			System.out.println("Invalid ");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		c.demoController();
	}
}
