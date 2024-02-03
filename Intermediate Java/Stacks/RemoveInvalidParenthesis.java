// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
// Solved this using below logic

import java.util.Stack;

public class RemoveInvalidParenthesis {
    public static void main(String[] args) {

    }

    // Using Stack Data Structure
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.peek() == ')') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        return stack.size();
    }

    // Without Using Stack Data Structure
    public int minAddToMakeValid2(String s) {
        int open = 0, close = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        return (open + close);
    }
}
