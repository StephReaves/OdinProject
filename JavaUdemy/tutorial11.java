package tutorial11;
// Array of string
public class Application {
	
	public static void main(String[] args) {
		// initialize
		String[] words = new String[3];
		
		//declare
		words[0] = "Hello";
		words[1] = "Steph";
		words[2] = "Bye";
		
		for(int i=0; i<words.length; i++){
			System.out.println(words[i]);
		}
		// initializes and declares
		String[] fruits = {"apple", "banana", "pear", "orange"};
		
		//goes through the fruits array and in turns sets the fruit variable to each item
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		
		int value = 0;
		
		//String class doesn't allocate enough memory for a string, but does enough for a reference (e.g scrap of paper to take a note) 
		String text = null; 
		
		System.out.println(text);
		
		//doesn't allocate memory for the strings here. just initializes the string array texts.
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		// here we allocate memory for the string 
		texts[0] = "one";
		
		System.out.println(texts[0]);
	}
}
