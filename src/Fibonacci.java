public class Fibonacci {
    public static void main(String[] args) {
        int numTerms = 10;
        for (int i = 1; i <= numTerms; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return -1; // Or handle the error in an appropriate way for your application
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}