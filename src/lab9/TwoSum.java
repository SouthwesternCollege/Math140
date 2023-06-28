package lab9;

import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class TwoSum {

    // O(n log n)
    public static int  twoSumFast(int[] a) {

        // O(n log n)
        Arrays.sort(a);

        int count = 0;
        // O(n)
        for (int i = 0; i < a.length; i++) {
            // O(log n)
            if(Arrays.binarySearch(a,-a[i]) > i){
                count++;
            }
        }
        return count;
    }

    // O(n^2)
    public static int twoSumQuadratic(int[] a) {
        int count = 0;
        for(int i = 0 ; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        //Generate am array of n DISTINCT ints within the interval [-n, n]
        int n = 300000;
        int[] numbers = new int[n];
        Random random = new Random();
        HashMap<Integer,Boolean> hash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int number;
            do{
                number = random.nextInt(-n,n);
            }while (hash.containsKey(number));
            hash.put(number,true);
            numbers[i] = number;
        }
        // System.out.println(Arrays.toString(numbers));

        // Timer start
        Stopwatch stopwatch = new Stopwatch();
        int count = twoSumQuadratic(numbers);
        double time = stopwatch.elapsedTime();
        // Timer end

        System.out.println("\nO(n^2)");
        System.out.println("twoSum count:" + count);
        System.out.println("time: " + time);

        // Timer start
        stopwatch = new Stopwatch();
        count = twoSumFast(numbers);
        time = stopwatch.elapsedTime();
        // Timer end


        System.out.println("\nO(n log n)");
        System.out.println("twoSum count:" + count);
        System.out.println("time: " + time);
    }

}
