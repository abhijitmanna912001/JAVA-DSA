// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
// Solved using below logics

import java.util.*;

public class FirstNegativeNWindow {

    // 2. Sliding Window Concept
    public long[] printFirstNegativeInteger2(long A[], int N, int K) {
        Queue<Long> queue = new LinkedList<Long>();
        int index = 0;

        while (index < K) {
            if (A[index] < 0) {
                queue.offer(A[index]);
            }
            index++;
        }

        long res[] = new long[N - K + 1];
        res[0] = (queue.isEmpty()) ? 0 : queue.peek();

        for (int i = 1; i < N - K + 1; i++) {
            // remove
            if (A[i - 1] < 0) {
                queue.poll();
            }

            // add
            if (A[i + K - 1] < 0) {
                queue.offer(A[i + K - 1]);
            }
            res[i] = (queue.isEmpty()) ? 0 : queue.peek();
        }

        return res;
    }

    // 1. Brute Force Method
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long[] res = new long[N - K + 1]; // Result array

        for (int i = 0; i <= N - K; i++) {
            boolean found = false; // Flag to check if a negative number is found in the window
            for (int j = 0; j < K; j++) {
                if (A[i + j] < 0) {
                    res[i] = A[i + j]; // Assign the first negative number found in the window
                    found = true; // Set flag to true
                    break; // No need to check further elements in this window
                }
            }
            if (!found) {
                res[i] = 0; // If no negative number found, assign 0 to the result array
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
