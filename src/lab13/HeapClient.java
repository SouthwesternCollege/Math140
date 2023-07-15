package lab13;

import edu.princeton.cs.algs4.*;

import java.util.Random;

public class HeapClient {
    public static void main(String[] args) {
//        MaxPQ<Counter> maxCount = new MaxPQ<>();
//        Counter heads = new Counter("heads");
//        Counter tails = new Counter("tail");
//        for (int i = 0; i < 100; i++) {
//            if (StdRandom.uniformDouble() < 0.5) {
//                heads.increment();
//            } else {
//                tails.increment();
//            }
//        }
//        maxCount.insert(heads);
//        maxCount.insert(tails);
//        for (Counter counter : maxCount) {
//            System.out.println(counter);
//        }

        String[] a = StdIn.readAllStrings();
        Heap.sort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }

    }
}
