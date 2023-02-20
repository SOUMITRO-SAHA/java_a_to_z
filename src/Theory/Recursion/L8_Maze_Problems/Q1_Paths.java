package Theory.Recursion.L8_Maze_Problems;

import java.util.ArrayList;

public class Q1_Paths {
    public static void main(String[] args) {
        int r = 1, c = 1;
        // Print all the possible path's to reach r,c from 3,3
//        mazePaths("", r, c);

        // Return an ArrayList containing all the answers of the path's
//        ArrayList<String> ans = mazePathsList("", r, c);
//        System.out.println(ans);

        // row = 3, col = 3
        mazePathRev("", 3, 3);
    }
    // When last cell is given like r = 3, col = 3 we have to go 1,1:
    private static void mazePathRev(String p, int row, int col){
        // Base Case:
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        // Recursive Call
        if( row == 1){
            // Only Horizontal Move
            mazePathRev(p+'H', row, col -1);
        }
        else if(col == 1){
            // Only Vertical Move
            mazePathRev(p+'V', row -1, col);
        }
        else {
            // Horizontal Move First:
            mazePathRev(p+'H', row, col -1);
            // Vertical Move Second:
            mazePathRev(p+'V', row -1, col);
        }
    }
    // ArrayList Containing all the Paths:
    private static ArrayList<String> mazePathsList(String s, int r, int c) {
        ArrayList<String> result = new ArrayList<>();

        // Calling the mPList() function:
        mPList(s,r,c,result);

        return result;
    }

    private static void mPList(String p, int r, int c, ArrayList<String> ans) {
        // Base Case:
        if(r == 3 && c == 3){
            ans.add(p);
            return;
        }

        // Recursive Call:
        if(r == 3){
            mPList(p+'R', r, c+1, ans);
        }
        else if(c == 3){
            // Only Down call:
            mPList(p+'D', r+1, c, ans);
        }
        else{
            // First Down Call:
            mPList(p+'D', r+1, c, ans);

            // Second Right Call:
            mPList(p+'R', r, c+1, ans);
        }
    }

    // Directly Print the Path:
    private static void mazePaths(String p, int r, int c) {
        // Base Case:
        if(r == 3 && c == 3){
            System.out.println(p);
            return;
        }

        //Recursive Call:
        if(r == 3){
            mazePaths(p+'R', r, c+1);
        }
        else if(c == 3){
            // Only Down call:
            mazePaths(p+'D', r+1, c);
        }
        else{
            // First Down Call:
            mazePaths(p+'D', r+1, c);

            // Second Right Call:
            mazePaths(p+'R', r, c+1);
        }
    }
}
