// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
// Solved LeetCode question using below logic

import java.util.Stack;

public class MinimumSwapsForBalance {
    public static void main(String[] args) {

    }

    // Method 1- Using Stack
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty() || stack.peek() == ']') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        int totalBrackets = stack.size();
        int closedBrackets = totalBrackets / 2;

        return (closedBrackets + 1) / 2;
    }

    // Method 2- Without using stacks
    public int minSwaps2(String s) {
        int open = 0, close = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[')
                open++;
            else {
                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        return (close + 1) / 2;
    }
}
