package BackTracking;

import java.util.ArrayList;

public class Maze_Problem {

	public static void main(String[] args) {

		// Print the count of paths
        System.out.println(countPath(1, 1));
        // Print the all possible paths
        printPath1("", 1, 1);
        System.out.println();
        // Return ArrayList that contains all possible paths
        System.out.println(printPath2("", 1, 1));
        // Return ArrayList that contains all possible paths including diagonal
        System.out.println(printPathDiagonal("", 1, 1));
    }

	static int countPath(int row , int col) {
		if(row == 3 || col == 3) {
			return 1;
		}
		
		int left =  countPath(row + 1 , col);
		int right = countPath(row , col + 1);
		
		return left + right;
	}

    static void printPath1(String p , int row , int col){
        if(row == 3 && col == 3) {
            System.out.print(p + " ");
            return;
        }

        if(row < 3){
        	printPath1(p + "D" , row + 1 , col);
        }
        if(col < 3)
        	printPath1(p + "R" , row , col + 1);
    }
    
    static ArrayList<String> printPath2(String p , int row , int col){
        if(row == 3 && col == 3) {
        	ArrayList<String> list = new ArrayList();
        	list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList();
        if(row < 3)
        	ans.addAll(printPath2(p + "D" , row + 1 , col));
        
        if(col < 3)
        	ans.addAll(printPath2(p + "R" , row , col + 1));
        return ans;
    }
    
    // Including Diagonal Paths
    static ArrayList<String> printPathDiagonal(String p , int row , int col){
        if(row == 3 && col == 3) {
        	ArrayList<String> list = new ArrayList();
        	list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList();
        if(row < 3)
        	ans.addAll(printPathDiagonal(p + "V" , row + 1 , col));
        
        if(col < 3)
        	ans.addAll(printPathDiagonal(p + "H" , row , col + 1));
        if(row < 3 && col < 3)
        	ans.addAll(printPathDiagonal(p + "V" , row + 1 , col + 1));
        return ans;
    }
    
    
    
}
