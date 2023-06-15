package lab2;

import edu.princeton.cs.algs4.In;

public class FileInput {
    public static void main(String[] args) {
        In input = new In("green-eggs-and-ham.txt");
        String text =  input.readAll();
        String[] words = text.split("\\W+");
        for (String word: words) {
            System.out.println(word);
        }
    }
}
