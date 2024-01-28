// https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
// Solved GFG Hard question using below logic

public class MedianMatrix {
    public static void main(String[] args) {

    }

    int median(int matrix[][], int R, int C) {
        int N = R * C;
        int medianIndex = N / 2;
        int start = 1;
        int end = 2000;

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;
            int lesserElements = findSmallerElements(matrix, assumedMedian);

            if (lesserElements <= medianIndex) {
                start = assumedMedian + 1;
            } else {
                end = assumedMedian - 1;
            }
        }

        return start;
    }

    int findSmallerElements(int matrix[][], int assumedMedian) {
        int noOfSmallerElements = 0;

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] <= assumedMedian) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            noOfSmallerElements += start;
        }

        return noOfSmallerElements;
    }
}
