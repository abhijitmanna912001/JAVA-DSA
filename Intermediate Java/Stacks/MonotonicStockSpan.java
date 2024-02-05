// https://leetcode.com/problems/online-stock-span/description/
// https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
// Solved these using below logic

import java.util.ArrayList;
import java.util.Stack;

public class MonotonicStockSpan {
    public static void main(String[] args) {

    }

    Stack<Integer> stack;
    ArrayList<Integer> list;

    public void StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);

        while (!stack.isEmpty() && list.get(stack.peek()) <= price) {
            stack.pop();
        }

        int previousGreaterIndex = (stack.isEmpty()) ? -1 : stack.peek();
        int currentIndex = list.size() - 1;
        int ans = currentIndex - previousGreaterIndex;
        stack.push(currentIndex);
        return ans;
    }
}
