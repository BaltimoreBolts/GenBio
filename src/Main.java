/*
 * Create a Class that takes in some information about a person
 * and has a method to generate a description paragraph about them.
 */

import java.util.Scanner;

public class Main {
	// <scope> <return_type> <method_name>
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // System.in takes in data from the terminal
		
		System.out.print("Please enter first name: "); // Acts as a prompt, specifying to the user what type of data we need
		String firstName = scanner.next(); //  causes program to wait for input, then stores the input in firstName as a String
		
		System.out.print("Please enter last name: ");
		String lastName = scanner.next();
		
		System.out.print("Please enter age: ");
		int age = scanner.nextInt();

		Info johnsInfo = new Info(firstName, lastName, age);
		System.out.println(johnsInfo.getBio());
		
		scanner.close();
	}
}
