package Theory.Recursion;

public class Lecture2 {
    // Q1 : Sum of Digits using Recursion:
    // Q2 : Product of Digits using Recursion:
    // Q3 : Reverse a Number
    // Q4 : Check whether the number is Palindrome or not using Recursion.
    // Q5 : Count the Number of Zeros in a Number.
    public static void main(String[] args) {
//        int n = 12345;
//        int n = 12321;
        int n = 1001001;
        // [*] To find the number of digits in an Integer:
        int dig = (int)(Math.log10(n)) +1;

//        System.out.println(dig);
        System.out.println(digSum(n));
        System.out.println(digProduct(n));
        System.out.println(reverseUsinLoop(n));
        System.out.println(reverse(n,0));
        System.out.println(palindrome(n));
        System.out.println(numOfZeros(n, 0));
    }
    /*
    // Brut-Force:
    static int digSum(int n, int sum){
        // Base Case:
        if(n <= 0)
            return sum;
        // Last Digit:
        int last = n % 10;

        // Adding the last digit:
        sum += last;
        return digSum(n/10, sum);
    }
     */
    static int digSum(int n){
        // Base Case:
        if(n == 0)
            return 0;

        return n%10 + digSum(n/10);
    }

    static int digProduct(int n){
        // Base Case:
        if(n%10 == n)
            return n;

        return n%10 * digProduct(n/10);
    }
    static int reverse(int n, int rev){
        // Base Case:
        if(n == 0){
            return rev;
        }
        rev = rev * 10 + n%10;
        return reverse(n/10, rev);
    }

    static int reverseUsinLoop(int n){
        int rev = 0;
        while(n > 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        return rev;
    }

    static String palindrome(int n){
        if(n == reverse(n,0)){
            return "Yes";
        }
        else return "No";
    }

    static int numOfZeros(int n, int c){
        if(n == 0){
            return c;
        }
        c += n%10 == 0? 1 : 0;

        return numOfZeros(n/10, c);
    }
}
