// https://www.geeksforgeeks.org/problems/count-squares3649/1
// Solved this GFG question using below logic

public class CountSquares {
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

        return start;
    }

    public int numSquares(int n) {
        int sqroot = mySqrt(n);
        return sqroot - 1;
    }
}
