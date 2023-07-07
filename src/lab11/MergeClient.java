package lab11;

import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.MergeBU;

import java.util.Arrays;

public class MergeClient {
    public static void main(String[] args) {
        String word1 = "jimmorrison";
        String word2 = "mrmojopisin";

        Character[] letters1 = toCharArray(word1);
        Character[] letters2 = toCharArray(word2);

        Merge.sort(letters1);
        Merge.sort(letters2);

        System.out.println(Arrays.toString(letters1));
        System.out.println(Arrays.toString(letters2));
        System.out.println("Is " + word1 + "an anagram of " + word2 + "?");
        System.out.println(equals(letters1, letters2));

    }
    public static Character[] toCharArray(String str) {
        Character[] charArray = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean equals(Character[] array1, Character[] array2) {
        if(array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
