package Theory.Recursion.L8_Maze_Problems;

public class Q3_Diagonal_Path {
    public static void main(String[] args) {
        diagonalPath("",3, 3);
    }

    private static void diagonalPath(String p, int r, int c) {
        // Base Case:
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        // Recursive Call:
        if(r == 1){
            // Only Horizontal Move
            diagonalPath(p+'H', r, c -1);
        }
        else if (c == 1) {
            // Only Vertical Move
            diagonalPath(p+'V', r-1, c);
        }
        else{
            // First Horizontal Move:
            diagonalPath(p+'H', r, c -1);
            // Diagonal Move:
            if(r > 1 && c > 1){
                // Diagonal Move Possible
                diagonalPath(p+'D', r-1, c-1);
            }
            // Third Vertical Move:
            diagonalPath(p+'V', r-1, c);
        }
    }
}
