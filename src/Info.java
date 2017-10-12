
public class Info {
	// Take in first name, last name, and age
	String firstName;
	String lastName;
	int age;
	
	public static String template = "${fName} ${lName} is ${age}";
	
	// Constructors are defined with public ClassName() {}
	public Info(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// <scope> <return_type> <method_name>
	public String getBio() {
		return template																			// ${fName} ${lName} is ${age}
				.replace("${fName}", this.firstName)						// John ${lName} is ${age}
				.replace("${lName}", this.lastName)							// John Squarepants is ${age}
				.replace("${age}", Integer.toString(this.age));	// John Squarepants is 32;
	}
}
