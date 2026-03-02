// Recursion is a technique where a method calls itself until a base condition is met.
public class Main {
    public static int sum(int n) {   // Time Complexity → O(n) Space Complexity → O(n) (recursion stack)
        if(n == 0) return 0;
        return n + sum(n - 1);
    }
    public static int factorial(int n) {   // Time → O(n) Space → O(n)
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static int fibonachi(int n) {  // Time → O(2ⁿ) Space → O(n)
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
	public static void main(String[] args) {
	    int a = fibonachi(3);
	    int b = factorial(3);
	    int c = sum(3);
		System.out.println("Fibonachi: "+a);
		System.out.println("Factorial: "+b);
		System.out.println("Sum: "+c);
	}
}
