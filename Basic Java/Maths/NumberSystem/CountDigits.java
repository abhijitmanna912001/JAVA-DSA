public class CountDigits {
    public static void main(String[] args) {
        countDigits(56743);
        countDigitsLog(56743);
    }

    public static void countDigits(int num) {
        if (num == 0) {
            System.out.println("Digits are: 1");
            return;
        }
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter++;
        }
        System.out.println("Digits are: " + counter);
    }

    public static void countDigitsLog(int num) {
        if (num == 0) {
            System.out.println("Digits are: 1");
            return;
        }

        // int count = (int) ((int) Math.log(num) / Math.log(10)) + 1;
        int count = (int) Math.log10(num) + 1;
        System.out.println("Digits are: " + count);
    }
}
