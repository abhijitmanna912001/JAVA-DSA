// https://leetcode.com/problems/valid-parentheses/description/
// https://www.geeksforgeeks.org/problems/parenthesis-checker2744/0
// Solved these 2 questions using below logic

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.peek();
                if (ch == ')' && top != '(')
                    return false;
                else if (ch == ']' && top != '[')
                    return false;
                else if (ch == '}' && top != '{')
                    return false;
                else
                    stack.pop();
            }
        }
        return (stack.size() == 0);
    }
}
