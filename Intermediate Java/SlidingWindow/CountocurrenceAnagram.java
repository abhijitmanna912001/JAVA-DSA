// https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
// Solved using below logic

import java.util.*;

public class CountocurrenceAnagram {
    public int search(String pat, String txt) {
        int patFreq[] = new int[26];
        int k = pat.length(), n = txt.length();

        // calc pattern freq
        for (int i = 0; i < k; i++) {
            int index = pat.charAt(i) - 97;
            patFreq[index]++;
        }

        // init window
        int textFreq[] = new int[26];
        for (int i = 0; i < k; i++) {
            int index = txt.charAt(i) - 97;
            textFreq[index]++;
        }

        int count = 0;
        if (Arrays.equals(textFreq, patFreq)) {
            count++;
        }

        // calc other windows
        for (int i = 1; i < n - k + 1; i++) {
            int removedCharIndex = txt.charAt(i - 1) - 97;
            int addedCharIndex = txt.charAt(i + k - 1) - 97;
            textFreq[addedCharIndex]++;
            textFreq[removedCharIndex]--;
            if (Arrays.equals(textFreq, patFreq)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
