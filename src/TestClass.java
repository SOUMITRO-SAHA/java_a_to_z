
//import for Scanner and other utility classes
import java.math.BigInteger;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                 // Reading input from STDIN
        while(t > 0) {
            Long n = sc.nextLong(); // Reading input from STD

            Solution1 sol = new Solution1(); // Creating Solution Object
            while(true){
                // Increasing the number:
                n += 1;
                boolean ans = sol.oneInt(n); // Function that takes One Integer input:
                if(ans){
                    System.out.println(n);
                    break;
                }
            }
            // Decreasing the t
            t --;
        }
        sc.close();
    }
}

class Solution1{
    boolean oneInt(long num){
        while(num > 0){
            long last = num % 10;
            if(last != 5 && last != 3){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}