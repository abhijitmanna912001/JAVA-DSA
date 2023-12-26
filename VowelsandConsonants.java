public class VowelsandConsonants {
    public static void main(String[] args) {
        String name = "abhijit";
        int len = 7;
        for (int pos = 0; pos < len; pos++) {
            char ch = name.charAt(pos);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Hi Vowel:\t" + ch);

            else
                System.out.println("Hi Consonant:\t" + ch);
        }
    }
}
