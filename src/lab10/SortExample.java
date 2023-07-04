package lab10;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Shell;

public class SortExample {
    public static void main(String[] args) {
        In input = new In("green-eggs-and-ham.txt");
        String text =  input.readAll();
        String[] words = text.split("\\W+");
        for (String word: words) {
            System.out.println(word);
        }
        Shell.sort(words);
        for (String word: words) {
            System.out.println(word);
        }
    }
}
