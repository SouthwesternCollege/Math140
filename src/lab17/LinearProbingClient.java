package lab17;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.LinearProbingHashST;
import edu.princeton.cs.algs4.StdOut;

public class LinearProbingClient {
    public static void main(String[] args) {
        LinearProbingHashST<String, Integer> st = new LinearProbingHashST<String, Integer>();
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
