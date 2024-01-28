public class FindRange {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 4, 5, 7, 9, 25, 56, 88, 94 };
        int range[] = findRangeInfinite(arr, 25);
        System.out.println(range[0] + ", " + range[1]);
    }

    static int[] findRangeInfinite(int arr[], int target) {
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            start = end;
            end = 2 * end;
        }

        range[0] = start;
        range[1] = end;

        return range;
    }
}
