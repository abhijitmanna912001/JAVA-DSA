public class UnsetBit {
    public static void main(String[] args) {
        printBits(33);
        int res = unsetIthBit(33, 0);
        printBits(res);

    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static int unsetIthBit(int num, int bit) {
        return num & ~(1 << bit);
    }
}
