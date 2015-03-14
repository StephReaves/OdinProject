package tutorial12;
//Multi-Dimensional Array
public class Application {
	public static void main(String[] args){
		// one dimensional number array 
		int[] values = {1, 2, 323};
		
		System.out.println(values[2]);
		//two sets of brackets for a multi-dimensional array
		// each element in a multi-deminsional array is an array or reference to an array 
		int[][] grid = {
			{1, 2, 323},
			{3, 2, 4},
			{6, 1, 3}
		};
		
		// written as row 1 and then column 2
		System.out.println(grid[1][2]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				//changed from println so it's all on same line
				System.out.print(grid[i][j] + "\t" );
			}
		System.out.println();
		}
		//not necessary to set the size of each array 
		String[][] words = new String[2][0];
	}
}