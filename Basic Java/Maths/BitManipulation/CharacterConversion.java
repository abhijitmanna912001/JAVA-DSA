public class CharacterConversion {
    public static void main(String[] args) {
        // char ch1 = convertCharToLowerCase('A');
        // System.out.println(ch1);
        char ch2 = convertCharToUpperCase('a');
        System.out.println(ch2);
        // printBits(~(1 << 5));
        // printBits('_');
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static char convertCharToUpperCase(int num) {
        // return (char) (num & ~(1 << 5));
        return (char) (num & '_');
    }

    public static char convertCharToLowerCase(int num) {
        // return (char) (num | (1 << 5));
        return (char) (num | ' ');
    }
}
