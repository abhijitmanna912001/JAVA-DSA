// https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1
// https://leetcode.com/problems/factorial-trailing-zeroes/description/

// Solved both questions using same logic

public class TrailingZeros {
    public static void main(String[] args) {
        trailingzerosofFactorial(10);
    }

    static void trailingzerosofFactorial(int num) {
        double res = 0;
        for (int i = 5; i <= num; i = i * 5) {
            res = res + Math.floor(num / i);
        }
        System.out.println(res);
    }
}
