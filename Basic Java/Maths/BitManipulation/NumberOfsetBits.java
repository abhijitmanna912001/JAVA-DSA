public class NumberOfsetBits {
    public static void main(String[] args) {
        printBits(67);
        NoOfSetBits(67);
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

    public static void NoOfSetBits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = unSetRightMostSetBit(num);
        }
        System.out.println(count);
    }
}
