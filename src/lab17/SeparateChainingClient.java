package lab17;

import edu.princeton.cs.algs4.SeparateChainingHashST;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class SeparateChainingClient {
    public static void main(String[] args) {
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        In input = new In("https://algs4.cs.princeton.edu/34hash/tinyST.txt");

        for (int i = 0; !input.isEmpty(); i++) {
            String key = input.readString();
            st.put(key, i);
        }

        // print keys
        for (String s : st.keys())
            StdOut.println(s + " " + st.get(s));

    }
}
