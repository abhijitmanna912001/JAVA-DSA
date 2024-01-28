public class BitonicArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 11, 16, 13, 11, 9, 3, 1 };
        minElementBitonic(arr);
    }

    static void minElementBitonic(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else if (arr.length == 1) {
            System.out.println("Min element is: " + arr[0]);
        } else {
            int res = (arr[0] < arr[arr.length - 1]) ? arr[0] : arr[arr.length - 1];
            System.out.println("Min element is: " + res);
        }
    }
}
