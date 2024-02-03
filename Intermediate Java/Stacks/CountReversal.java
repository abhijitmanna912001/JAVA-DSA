// https://www.geeksforgeeks.org/problems/count-the-reversals0401/1
// Solved using below logic

import java.util.Stack;

public class CountReversal {
    public static void main(String[] args) {

    }

    // Method 1 // Using Stack Data Structure
    int countRev(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.peek() == '}') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        int ans = 0, open = 0, close = 0;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '{') {
                open++;
            } else {
                close++;
            }
        }

        ans = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        return ans;
    }

    // Method 2 // Without Stack
    int countRev2(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }

        int ans = 0, open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                open += 1;
            } else {

                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        ans = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        return ans;
    }

}
