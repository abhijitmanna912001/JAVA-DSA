// https://leetcode.com/problems/spiral-matrix/submissions/1151488265/
// https://leetcode.com/problems/spiral-matrix-ii/submissions/1151506679/
// https://www.geeksforgeeks.org/problems/spiral-matrix--141631/1
// https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int x,y = 0;
        List<Integer> result = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow += 1;

            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol -= 1;

            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow -= 1;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol += 1;
            }
        }

        return result;
    }
}
