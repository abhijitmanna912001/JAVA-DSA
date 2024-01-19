// https://www.geeksforgeeks.org/problems/square-root/1
// https://leetcode.com/problems/sqrtx/description/
// Solved GFG and Leetcode Questions

public class Sqrt {
    public static void main(String[] args) {

    }

    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                if (x % mid == 0 && mid == x / mid) {
                    return mid;
                }
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return end;
    }
}
