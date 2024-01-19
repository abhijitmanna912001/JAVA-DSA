// https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
// https://www.geeksforgeeks.org/problems/swapping-triangles5209/1?page=6&category=Matrix&sortBy=submissions
// https://leetcode.com/problems/transpose-matrix/description/
// Solved these GFG and LeetCode questions

public class TransposeMatrix {
    public static void main(String[] args) {

    }

    public void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(a, i, j);
            }
        }
    }

    public void swap(int a[][], int i, int j) {
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
}
