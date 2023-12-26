public class VowelsandConsonants {
    public static void main(String[] args) {
        String name = "abhijit";
        char ch = name.charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Hi Vowel: " + ch);
        }

        else {
            System.out.println("Hi Consonant: " + ch);
        }
    }
}
