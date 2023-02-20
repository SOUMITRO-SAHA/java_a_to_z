package Practice_Problem.AJ.__Weekly_Contest.Feb_2023.W1_Feb;
/*
Catching Up
https://course.acciojob.com/idle?question=39a7cdff-37a9-4233-821a-42b418bf3463
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(45, 60));
    }
    // extended Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}

// Recursive Method my_solution
class Solution {
    int catchingUp(int a, int b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;

        // Base Case:
        if (a == b)
            return a;

        // Recursive Call
        if( a > b){
            return catchingUp(a-b, b);
        }
        return catchingUp(a, b-a);
    }

}
