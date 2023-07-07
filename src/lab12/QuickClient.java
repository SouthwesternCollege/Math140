package lab12;

import edu.princeton.cs.algs4.*;

public class QuickClient {
    public static void main(String[] args) {
        //Read and split text
        In input = new In("green-eggs-and-ham.txt");
        String text =  input.readAll();
        String[] words = text.split("\\W+");

        // Sort and time
        Stopwatch stopwatch = new Stopwatch();
        Quick3way.sort(words);
        System.out.println(stopwatch.elapsedTime());

        for (String word: words) {
            System.out.println(word);
        }
    }
}
