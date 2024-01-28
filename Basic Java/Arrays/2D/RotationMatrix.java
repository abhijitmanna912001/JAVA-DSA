// https://leetcode.com/problems/rotate-image/submissions/1151454330/
// https://www.geeksforgeeks.org/problems/rotate-a-2d-array-without-using-extra-space1004/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// Solved these GFG and LeetCode question using below logic

public class RotationMatrix {
    public static void main(String[] args) {

    }

    public void rotateAntiClockwise(int[][] matrix, int n) {
        transpose(n, matrix);

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(n, matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
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
