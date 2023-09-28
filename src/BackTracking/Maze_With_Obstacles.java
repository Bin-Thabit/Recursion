package BackTracking;

public class Maze_With_Obstacles {

	public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        Print_Paths_With_Obstacles("",0 , 0 , maze);

    }

    static void Print_Paths_With_Obstacles(String p , int row , int col , boolean[][] maze){
        if (row == maze.length - 1 && col == maze.length - 1){
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false){
            return;
        }
        if(row < maze.length - 1) {
            Print_Paths_With_Obstacles(p + "D", row + 1, col, maze);
        }
        if(col < maze.length - 1) {
            Print_Paths_With_Obstacles(p + "R", row, col + 1, maze);
        }
    }
}
