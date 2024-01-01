// https://practice.geeksforgeeks.org/problems/set-kth-bit3724/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
// I solved this using below logic

public class SetBits {
    public static void main(String[] args) {
        printBits(32);
        int res = setIthBit(32, 4);
        printBits(res);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static int setIthBit(int num, int bit) {
        return num | (1 << bit);
    }
}
