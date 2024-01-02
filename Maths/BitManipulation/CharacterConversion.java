public class CharacterConversion {
    public static void main(String[] args) {
        char ch1 = convertCharToLowerCase('A');
        System.out.println(ch1);
        char ch2 = convertCharToUpperCase('a');
        System.out.println(ch2);
    }

    public static char convertCharToUpperCase(int num) {
        return (char) (num & ~(1 << 5));
    }

    public static char convertCharToLowerCase(int num) {
        return (char) (num | (1 << 5));
    }
}
