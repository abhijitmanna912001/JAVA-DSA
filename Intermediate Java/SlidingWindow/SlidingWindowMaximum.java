// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// https://www.geeksforgeeks.org/problems/ipl-2021-match-day-2--141634/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// https://leetcode.com/problems/sliding-window-maximum/
// Solved all these questions using below logic

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n - k + 1];
        if (n == 0) {
            return res;
        }
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int index = 0;

        while (index < k) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[index]) {
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }

        res[0] = nums[deque.peekFirst()];
        for (int i = 1; i < n - k + 1; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i + k - 1]) {
                deque.pollLast();
            }
            deque.offerLast(i + k - 1);
            res[i] = nums[deque.peekFirst()];
        }

        return res;
    }

    public static void main(String[] args) {

    }
}