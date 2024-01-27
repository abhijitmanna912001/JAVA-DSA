public class PrintBits {
    public static void main(String[] args) {
        printBits(15);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
