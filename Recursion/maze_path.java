/*
 you are given a m*n grid, you have to reach from top left to bottom right corner of the grid. You can only move either down or right at a time. Find the number of ways to reach the destination.
 */

import java.util.Scanner;
public class maze_path {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter m, n:");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.print("Number of ways to reach the destination: ");
        System.out.println(maze(1,1,m,n));    // we are passing 1, 1 as the starting row and column
        in.close();
    }
    public static int maze(int row, int col, int m, int n) {
        //base case
        // if(row==m || col==n)   return 1;
        if(row==m && col==n)    return 1;  //if we reach the destination
        if(row>m || col>n)  return 0;  //if we go out of the grid
        //work and call
        int right=maze(row,col+1,m,n);
        int down=maze(row+1,col,m,n);
        return right+down;  //recursive call
    }
        
}
