public class UnsetRightmostSetBit {
    public static void main(String[] args) {
        printBits(48);
        int res = unSetRightMostSetBit(48);
        printBits(res);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static int unSetRightMostSetBit(int num) {
        return (num & num - 1);
    }
}
