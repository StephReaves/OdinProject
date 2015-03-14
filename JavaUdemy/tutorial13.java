class Person {
	//Classes can contain 1) Data (state) -> instance variables 2) Sub-routine -> methods
	String name; 
	int age; 
}

public class Application {
	//the main is a sub-routine 
	public static void main(String[] args) {
		// Person is the type; person1 is the variable name; set the variable equal to the new Object 
		Person person1 = new Person();
		person1.name = "Steph Reaves"; 
		person1.age = 30; 
		
		System.out.println(person1.name);
	}

}
