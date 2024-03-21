// https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Solved using below both logic

import java.util.*;

public class LongestSubStringNonRepeating {
    // Method 2 - Using HashMap
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int windowStart = 0, windowEnd = 0;
        int maxLen = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();
        while (windowEnd < n) {
            char ch = s.charAt(windowEnd);
            if (map.containsKey(ch) && map.get(ch) >= windowStart) {
                windowStart = map.get(ch) + 1;
            }
            map.put(ch, windowEnd);
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }

    // Method 1 - Using HashSet
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int windowStart = 0, windowEnd = 0;
        int maxLen = Integer.MIN_VALUE;

        HashSet<Character> set = new HashSet<>();
        while (windowEnd < n) {
            char ch = s.charAt(windowEnd);
            if (set.contains(ch)) {
                // Shrinking
                while (windowStart < windowEnd && set.contains(ch)) {
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }

    public static void main(String[] args) {

    }
}
