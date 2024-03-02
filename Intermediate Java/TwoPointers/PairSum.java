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
                // Handle the case when arr[start] + arr[end] == k
                if (arr[start] != arr[end]) {
                    // Count the occurrences of arr[start]
                    int countStart = 1;
                    while (start + countStart < end && arr[start + countStart] == arr[start]) {
                        countStart++;
                    }

                    // Count the occurrences of arr[end]
                    int countEnd = 1;
                    while (end - countEnd > start && arr[end - countEnd] == arr[end]) {
                        countEnd++;
                    }

                    // Add the product of counts to the total pairs count
                    countPairs += countStart * countEnd;

                    // Move pointers to the next unique elements
                    start += countStart;
                    end -= countEnd;
                } else {
                    // Handle the case when arr[start] == arr[end]
                    int totalPairs = end - start + 1;
                    countPairs += (totalPairs * (totalPairs - 1)) / 2; // C(totalPairs, 2)
                    break;
                }
            }
        }

        return countPairs;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 5, 5, 5, 6, 6, 11 };
        int k = 11;

        // Call the countPairsWithDuplicates method
        int result = countPairsWithDuplicates(arr, k);

        // Display the result
        System.out.println("Number of pairs with sum " + k + ": " + result);
    }
}