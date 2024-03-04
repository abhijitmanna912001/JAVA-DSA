// https://www.geeksforgeeks.org/minimize-maxai-bj-ck-minai-bj-ck-three-different-sorted-arrays/
// Solved this question using below logic

public class MinAbsDifference {

    public static int minimizeAbsoluteDifference(int[] A, int[] B, int[] C) {
        int i = 0, j = 0, k = 0;
        int ans = Integer.MAX_VALUE;

        while (i < A.length && j < B.length && k < C.length) {
            int minVal = Math.min(A[i], Math.min(B[j], C[k]));
            int maxVal = Math.max(A[i], Math.max(B[j], C[k]));

            ans = Math.min(ans, maxVal - minVal);

            // Increment the pointer of the array with the minimum value
            if (A[i] == minVal) {
                i++;
            } else if (B[j] == minVal) {
                j++;
            } else {
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 4, 5, 8, 10 };
        int[] B = { 6, 9, 15 };
        int[] C = { 2, 3, 6, 6 };

        System.out.println(minimizeAbsoluteDifference(A, B, C)); // Output: 1
    }
}
