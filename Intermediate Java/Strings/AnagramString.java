// https://leetcode.com/problems/valid-anagram/description/
// https://www.geeksforgeeks.org/problems/anagram-1587115620/1
// Solved these questions using below logic

public class AnagramString {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int len = a.length();
        int freq[] = new int[26];
        int index1 = 0;
        int index2 = 0;

        while (index1 < len && index2 < len) {
            char char1 = a.charAt(index1);
            int freqIndex1 = char1 - 97;

            freq[freqIndex1] += 1;

            char char2 = a.charAt(index2);
            int freqIndex2 = char2 - 97;

            freq[freqIndex2] -= 1;

            index1++;
            index2++;

        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
