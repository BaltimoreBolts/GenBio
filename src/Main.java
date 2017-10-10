/*
 * Create a Class that takes in some information about a person
 * and has a method to generate a description paragraph about them.
 */

public class Main {
	// <scope> <return_type> <method_name>
	public static void main(String[] args) {
		Info johnsInfo = new Info("John", "Squarepants", 32);
		System.out.println(johnsInfo.getBio());
	}
}
