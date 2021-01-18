import java.util.*;

public class Solution {
    /**
     * Question: Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * Questions to ask
     * 1. Is this expected to be case sensitive?
     * 2. Is whitespace relevant?
     * @param input
     * @return
     */
    public static boolean isUniqueDataStructure(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.length() > 127) {
            return false;
        }

        Set<Character> ref = new HashSet<>();
        for (int i=0; i<input.length(); i++) {
            if (ref.contains(input.charAt(i))) {
                return false;
            } else {
                ref.add(input.charAt(i));
            }
        }
        return true;
    }

    /**
     * Question: Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * Questions to ask
     * 1. Is this expected to be case sensitive?
     * 2. Is whitespace relevant?
     * @param input
     * @return
     */
    public static boolean isUniqueNoDataStructure(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.length() > 127) {
            return false;
        }

        for (int i=0; i<input.length(); i++) {
            Character curr = input.charAt(i);
            for (int j=i+1; j < input.length(); j++) {
                if (curr == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Question: Check Permutation: Given two strings,write a method to decide if one is a permutation of the
     * other.
     * Questions to ask
     * 1. Is this expected to be case sensitive?
     * 2. Is whitespace relevant?
     * @param input1
     * @param input2
     * @return
     */
    public static boolean isPermutationDataStructure(String input1, String input2) {
        if (input1 == input2) {
            return true;
        }

        if (input1.length() != input2.length()) {
            return false;
        }

        char[] ref1 = input1.toCharArray();
        char[] ref2 = input2.toCharArray();

        Arrays.sort(ref1);
        Arrays.sort(ref2);

        return String.valueOf(ref1).equals(String.valueOf(ref2));
    }

    /**
     * Question: URLify: Write a method to replace all spaces in a string with '%20'.
     * You may assume that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string.
     * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
     * @param input
     * @return
     */
    public static String urlify(String input) {
        char[] refArray = input.toCharArray();
        for (int i = 0; i < refArray.length; i++) {
            if ((int) refArray[i] == 32) {
                refArray[i] = '%20';
            }
        }
        return String.valueOf(refArray);
    }

}
