// https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1
// Solved this question using distinct logic

class PairSum {

    public static int countPairsWithDuplicates(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int countPairs = 0;

        while (start < end) {
            if (arr[start] + arr[end] > k) {
                end--;
            } else if (arr[start] + arr[end] < k) {
                start++;
            } else {

                if (arr[start] != arr[end]) {

                    int countStart = 1;
                    while (start + countStart < end && arr[start + countStart] == arr[start]) {
                        countStart++;
                    }

                    int countEnd = 1;
                    while (end - countEnd > start && arr[end - countEnd] == arr[end]) {
                        countEnd++;
                    }

                    countPairs += countStart * countEnd;

                    start += countStart;
                    end -= countEnd;
                } else {

                    int totalPairs = end - start + 1;
                    countPairs += (totalPairs * (totalPairs - 1)) / 2;
                    break;
                }
            }
        }

        return countPairs;

    }

    public static int countPairsWithDistinctElements(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int countPairs = 0;

        while (start < end) {
            int currentSum = arr[start] + arr[end];

            if (currentSum == k) {
                // Found a pair with the sum equal to k
                countPairs++;
                start++;
                end--;
            } else if (currentSum < k) {
                // Move start pointer to the right
                start++;
            } else {
                // Move end pointer to the left
                end--;
            }
        }

        return (countPairs > 0) ? countPairs : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 8;

        int result = countPairsWithDistinctElements(arr, k);

        System.out.println("Number of pairs with sum " + k + ": " + result);
    }
}