package Lab1;

import edu.princeton.cs.algs4.StdRandom;

public class Flip {
    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        System.out.println(heads.toString());
        System.out.println(tails.toString());

        for (int flips = 1; flips <= 100; flips++) {
            if(Math.random() < 0.5) {
                heads.increment();
            } else {
                tails.increment();
            }
        }

        System.out.println(heads.toString());
        System.out.println(tails.toString());

        System.out.println(heads.tally());
        System.out.println(tails.tally());

        System.out.println(heads.compareTo(tails));

/*        System.out.println(heads.equals(tails));
        System.out.println(heads.getClass());
        System.out.println(heads.hashCode());
        System.out.println(tails.hashCode());*/

    }
}
