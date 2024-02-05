// https://www.geeksforgeeks.org/problems/help-classmates--141631/1?page=3&category=Stack&sortBy=submissions
// Solved this GFG question using below logic

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {

    }

    public static int[] help_classmate(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();

        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                res[i] = -1;
            else
                res[i] = stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
