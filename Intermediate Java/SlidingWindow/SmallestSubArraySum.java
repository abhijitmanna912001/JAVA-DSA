// https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// Solved using below logic

public class SmallestSubArraySum {
    public static int smallestSubWithSum(int a[], int n, int x) {
        int windowStart = 0, windowEnd = 0, sum = 0, len = 0;
        int minLen = Integer.MAX_VALUE;

        while (windowEnd < n) {
            // expansion
            sum += a[windowEnd];
            if (sum > x) {
                len = windowEnd - windowStart + 1;
                minLen = Math.min(minLen, len);

                // shrinking
                while (windowStart < windowEnd && sum > x) {
                    sum -= a[windowStart];
                    windowStart++;

                    if (sum > x) {
                        len = windowEnd - windowStart + 1;
                        minLen = Math.min(minLen, len);
                    }
                }
            }
            windowEnd++;
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {

    }
}
