package BackTracking;

public class Maze_Problem {

	public static void main(String[] args) {

		// Print the count of paths
        System.out.println(countPath(1, 1));
        // Print the all possible paths
        printPath("", 1, 1);
    }

	static int countPath(int row , int col) {
		if(row == 3 || col == 3) {
			return 1;
		}
		
		int left =  countPath(row + 1 , col);
		int right = countPath(row , col + 1);
		
		return left + right;
	}

    static void printPath(String p , int row , int col){
        if(row == 3 && col == 3) {
            System.out.print(p + " ");
            return;
        }

        if(row < 3){
        	printPath(p + "D" , row + 1 , col);
        }
        if(col < 3)
        	printPath(p + "R" , row , col + 1);
    }
    
}
