// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
// solved using below logic

public class LongestsubString {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        int windowStart = 0, windowEnd = 0;
        int len = 0, maxLen = Integer.MIN_VALUE;
        int freqHash[] = new int[26];
        int uniqueCharCount = 0;

        while (windowEnd < n) {
            int index = s.charAt(windowEnd) - 97;
            if (freqHash[index] == 0) {
                uniqueCharCount++;
                freqHash[index]++;
            } else {
                freqHash[index]++;
            }

            if (uniqueCharCount == k) {
                len = windowEnd - windowStart + 1;
                maxLen = Math.max(maxLen, len);
            } else if (uniqueCharCount > k) {
                while (windowStart < windowEnd && uniqueCharCount > k) {
                    index = s.charAt(windowStart) - 97;
                    windowStart++;
                    freqHash[index]--;
                    if (freqHash[index] == 0) {
                        uniqueCharCount--;
                    }
                }
            }
            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? -1 : maxLen;
    }

    public static void main(String[] args) {

    }
}
