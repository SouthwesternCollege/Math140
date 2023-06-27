package lab8;

import java.util.Arrays;

public class BinarySearch {

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */


    public static int indexOf(int key, int[] a, int lo, int hi) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return indexOf(key, a, lo, mid - 1);
        else if (key > a[mid])
            return indexOf(key, a, mid + 1, hi);
        else
            return mid;

    }


    /**
     * Reads in a sequence of integers from the allowlist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(indexOf(10, numbers, 0, numbers.length-1));

    }
}