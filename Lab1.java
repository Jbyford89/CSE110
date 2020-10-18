// Author: James Byford
// Filename: Scanner Expressions Lab1
// Specification: Write a program that will take the average of 3 test scores and return what the average grade is.
// For: CSE110- Lab #1
// Time Spent: 2.5 hours
import java.util.Scanner; //import of Scanner expression
public class Lab1 {

	public static void main(String[] args) {
		
		double test1, test2, test3 = 0;
		final double NUM_TESTS = 3;
		
		Scanner keyboard = new Scanner(System.in);
		
		//This displays test1 input and output
		
		System.out.println("Plz input test 1 score:"); // Prompt output
		test1 = keyboard.nextDouble();
		System.out.println("Your test 1 is " + test1); //Prompt output
		
		//This displays test2 input and output

		System.out.println("Plz input test 2 score:"); //Prompt output
		test2 = keyboard.nextDouble();
		System.out. println("Your test 2 is " + test2); //Prompt output
		
		//This displays test3 input and output

		System.out.println("Plz input test 3 score:"); //Prompt output
		test3 = keyboard.nextDouble();
		System.out.println("Your test 3 is " + test3); //Prompt output
		// -->
		
		double avg;
		avg = (test1 + test2 + test3) / (double) NUM_TESTS; //Cast NUM_TESTS
		System.out.println("Your average score is "  + avg); //Prompt output
		
		

	}

}

