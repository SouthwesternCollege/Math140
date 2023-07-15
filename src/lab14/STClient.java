package lab14;

import edu.princeton.cs.algs4.*;

import java.io.File;

public class STClient {
    public static void main(String[] args) {
        In input = new In(new File("dracula.txt"));
        String[] words = input.readAll().split("[\\W || \\p{Punct}&&[^']]+");

        // BinarySearchST<String, Integer> table = new BinarySearchST<>();
        // BST<String, Integer> table = new BST<>();
        // RedBlackBST<String, Integer> table = new RedBlackBST<>();
        LinearProbingHashST<String, Integer> table = new LinearProbingHashST<>();

        // Timer starts
        Stopwatch stopwatch = new Stopwatch();
        for(String word : words) {
            word = word.toUpperCase();
            if(table.contains(word)){
                table.put(word, table.get(word) + 1);
            } else {
                table.put(word,1);
            }
        }
        System.out.println("***ELAPSED TIME: " + stopwatch.elapsedTime());
        // timer ends

//        for (String word : table.keys()) {
//            System.out.println(word + ": " +table.get(word));
//        }

    }
}
