package BackTracking;

import java.util.Arrays;

public class Print_matrix_and_path {

	public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        //AllPath("",0 , 0 , maze);
        int[][] path = new int[maze.length][maze[0].length];
        printAllPathAndArray("" , 0 , 0 , 1 , maze , path);
    }

    static void AllPath(String p , int row , int col , boolean[][] maze){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false)
            return;
        // I am considering this block in my path
        maze[row][col] = false;

        if(row < maze.length - 1) {
            AllPath(p + "D", row + 1, col, maze);
        }
        if(col < maze[0].length - 1) {
            AllPath(p + "R", row, col + 1, maze);
        }
        if(row > 0){
            AllPath(p + "U", row-1, col, maze);
        }
        if(col > 0){
            AllPath(p + "L", row, col-1, maze);
        }
        //This line is where the function will be over
        // Before the function gets removed , also remove the changes that were made by function
        maze[row][col] = true;

    }

    static void printAllPathAndArray(String p , int row , int col ,int steps , boolean[][] maze , int[][] path){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            path[row][col] = steps;
            for(int[]arr: path){
                System.out.println(Arrays.toString(arr));
            }

            return;
        }
        if(maze[row][col] == false)
            return;
        // I am considering this block in my path
        maze[row][col] = false;
        path[row][col] = steps;
        if(row < maze.length - 1) {
            printAllPathAndArray(p + "D", row + 1, col, steps+1 , maze , path);
        }
        if(col < maze[0].length - 1) {
            printAllPathAndArray(p + "R", row, col + 1, steps + 1,  maze, path);
        }
        if(row > 0){
            printAllPathAndArray(p + "U", row-1, col, steps + 1, maze , path);
        }
        if(col > 0){
            printAllPathAndArray(p + "L", row, col-1,steps + 1 , maze , path);
        }
        //This line is where the function will be over
        // Before the function gets removed , also remove the changes that were made by function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
