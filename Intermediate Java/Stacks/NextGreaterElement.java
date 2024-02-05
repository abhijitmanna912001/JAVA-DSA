// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=1&category=Stack&sortBy=submissions
// Solved this GFG question using below logic

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

    }

    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();

        long res[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
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
