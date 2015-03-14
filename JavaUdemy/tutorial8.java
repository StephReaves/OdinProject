import java.util.Scanner;


public class Application {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number:");
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
		*/
		int value = 0; //declare value outside of the do while loop
		do {
			System.out.println("Enter a number:");
			value = scanner.nextInt();
		} //variable scope is only within the innermost curly brackets where it is declared 
		while(value != 5); //value is checked outside of the brackets so declare outside
		
		System.out.println("Got 5!");
	}

}