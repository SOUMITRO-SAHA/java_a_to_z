package Theory.DataStructure.Recursion;

public class Lecture1 {

    // Topic 1: How Functions Work:
    /*
    public static void main(String[] args) {
        print1(5);
    }
    static void print1(int n){
        System.out.println(n);
        n--;
        print2(n);
    }
    static void print2(int n){
        System.out.println(n);
        n--;
        print3(n);
    }
    static void print3(int n){
        System.out.println(n);
    }
    // Topic 2: Fibonacci Number (n = 5)
    public static void main(String[] args) {
        int n=7;
        int fibbonacciNumber = fib(n);
        System.out.println(fibbonacciNumber);
    }

    static int fib(int n){
        if(n < 2)
            return n;
        return fib(n-1)+fib(n-2);
    }
     */
    // Topic 3: Binary Search in an Array using Recursion.
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,16};
        int len = arr.length;
        int key = 100;
        System.out.println(binarySearch(arr,key,0,len-1));
    }

    static int binarySearch(int[]arr,int key, int s, int e){
        int mid = (s+e)/2;
        // Base Case:
        if(s > e)
            return -1;
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid] > key){
            return binarySearch(arr,key,s,mid -1);
        }
        return binarySearch(arr,key,mid+1, e);
    }

}
