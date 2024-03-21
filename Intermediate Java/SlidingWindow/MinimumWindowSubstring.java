import java.util.*;

// https://leetcode.com/problems/minimum-window-substring/description/
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // populate the map with t string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int uniqueCharCount = freqMap.size();
        int startIndex = -1, windowStart = 0, windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int N = s.length();

        while (windowEnd < N) {
            // Expansion
            char ch = s.charAt(windowEnd);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) - 1);
                if (freqMap.get(ch) == 0) {
                    uniqueCharCount--;
                }
            }

            // Shrinking
            while (uniqueCharCount == 0) {
                // find len
                int len = windowEnd - windowStart + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = windowStart;
                }

                ch = t.charAt(windowStart);
                if (freqMap.containsKey(ch)) {
                    freqMap.put(ch, freqMap.get(ch) + 1);
                    if (freqMap.get(ch) > 0) {
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }

        if (startIndex == -1) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }

    // https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
    public static String smallestWindow(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // populate the map with t string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int uniqueCharCount = freqMap.size();
        int startIndex = -1, windowStart = 0, windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int N = s.length();

        while (windowEnd < N) {
            // Expansion
            char ch = s.charAt(windowEnd);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) - 1);
                if (freqMap.get(ch) == 0) {
                    uniqueCharCount--;
                }
            }

            // Shrinking
            while (uniqueCharCount == 0) {
                // find len
                int len = windowEnd - windowStart + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = windowStart;
                }

                ch = s.charAt(windowStart);
                if (freqMap.containsKey(ch)) {
                    freqMap.put(ch, freqMap.get(ch) + 1);
                    if (freqMap.get(ch) > 0) {
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }

        if (startIndex == -1 || minLen == Integer.MAX_VALUE) { // If no window found
            return "-1";
        }

        return s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {

    }

}
