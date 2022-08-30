// AUTHOR: Bryce Lam
// FILENAME: Lab1
// SPECIFICATION: Calculate the average of three test grades
// FOR: CS 1400- Lab #1
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

// All imports have to be included outside the public class
// import the Scanner class from the java.util library
import java.util.Scanner;

// class name should match the file name
public class Lab1{
	// we must have a main method to run the program
	public static void main(String[] args){

		// create a Scanner object to get input from the keyboard
		Scanner input = new Scanner(System.in);


		// declare three integer variables to hold the test scores  
		int test1, test2 = 0, test3 = 0;
		
		//New comment
		// declare one integer constant to hold the number of tests  
		final int NUM_TESTS = 3;
		
		
		// declare one double variable to hold the average  
		double average;
		

		// Get the Input
		System.out.println("Enter the score on the first test: ");
		test1 = input.nextInt();
		System.out.println("Enter the score on the second test: ");
		test2 = input.nextInt();
		System.out.println("Enter the score on the third test: ");
		test3 = input.nextInt();

		// Calculate the average
		average = (test1+test2+test3)/(double)NUM_TESTS;


		// Display Results
		System.out.println("Your average score is: " + average);
		
		
		// Close your Scanner object
		input.close();


	}//end main method
}//end Lab1 class
