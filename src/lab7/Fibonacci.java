package lab7;

import java.util.ArrayList;

public class Fibonacci {
    private static ArrayList<Integer> fibonacciList = new ArrayList<>();
    public static void main(String[] args) {
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println(fibonacci(100));
        System.out.println(fibonacciList);
    }
    public static int fibonacci(int n) {
        if(n < 2) {
            return n;
        } else if (fibonacciList.size() > n) {
            return fibonacciList.get(n);
        } else {
            fibonacciList.add(fibonacci(n - 2) + fibonacci(n - 1));
            return fibonacciList.get(n);
        }

    }
}
