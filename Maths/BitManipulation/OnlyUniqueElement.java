// https://leetcode.com/problems/single-number/description/
// I solved this question using below logic

public class OnlyUniqueElement {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 6, 3, 3, 1, 1, 6 };
        printOnlyUniqueElement(arr);
    }

    public static void printOnlyUniqueElement(int arr[]) {
        int l = arr.length;
        int res = 0;
        for (int i = 0; i < l; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
