// https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
// I solved using the below logic

public class EvenOdd {
    public static void main(String[] args) {
        printOddEven(44);
    }

    public static void printOddEven(int num) {
        if (isBitSet(num, 0)) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);
        return (res == 0) ? false : true;
    }
}
