public class MaximumSumArray {
    public static void main(String[] args) {
        int arr2d[][] = {
                { 2, 4, 1, 5, 1 },
                { 6, 7, 3, 4, 2 },
                { 8, 1, 2, 2, 3 },
                { 5, 5, 7, 8, 4 }
        };
        findMaximumSumArray(arr2d);
    }

    public static void findMaximumSumArray(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int resIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
                resIndex = i;
            }
        }
        System.out.println("Maximum subarray sum is: " + max + ", for the index " + resIndex);
    }
}