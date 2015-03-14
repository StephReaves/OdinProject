//Arrays - Java gives all values in an array a default value of 0
// can use command + shift + f to format 
public class Application {
	public static void main(String[] args) {
		// int means create enough memory to hold an integer of 32 bits
		int value = 7;

		// array of integers can be done with name of values (values is the
		// reference type / variable)
		// create a variable that refers to a list of integers, doesn't hold the
		// array, but refers to it
		int[] values;
		// pointing values reference to new array of 3 integers, allocates
		// enough memory to hold 3 integers. initializing values
		values = new int[3];

		System.out.println(values[0]);
		
		//setting values 
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		//getting values 
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//looping through items in the array 
		for(int i=0; i<values.length; i++){
			System.out.println(values[i]);
		}
		
		// initialize and declare values in one line 
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}