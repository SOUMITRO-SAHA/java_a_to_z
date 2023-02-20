package Theory.Recursion.L8_Maze_Problems;

public class Q2_Path_Count {
    public static void main(String[] args) {
        int count = pathCount(3,3);
        System.out.println(count);
    }

    private static int pathCount(int row, int col) {
        // Base Case:
        if (row == 1 && col == 1) {
            return 1;
        } else if (row < 1 || col < 1) {
            return 0;
        }

        // Recursive Call:
        int left = pathCount(row - 1, col);
        int right = pathCount(row, col - 1);

        return left + right;
    }
}
