package main.java.com.academic.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapDemo{

    public static void main(String args[]) throws IOException{

    //int num1 = Integer.parseInt(args[0]);
    //int num2 = Integer.parseInt(args[1]);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please Enter the First number ");
    String s1 = br.readLine();
    int num1 = Integer.parseInt(s1);
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please Enter the Second number ");
    String s2 = br1.readLine();
    int num2 = Integer.parseInt(s2);    
    System.out.println("\n***Before Swapping***");
    System.out.println("Number 1 : "+num1);
    System.out.println("Number 2 : "+num2);
    //Swap logic
    int temp = 0;
    num1 = temp ;
    num1 = num2 ;
    temp = num2 ;
    System.out.println("\n***After Swapping***");
    System.out.println("Number 1 : "+num1);
    System.out.println("Number 2 : "+num2);

    }

}