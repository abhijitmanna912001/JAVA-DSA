public class Loops {
    public static void main(String[] args) {

        for (int num = 2; num < 4; num++) {
            for (int times = 1; times <= 10; times++) {
                System.out.println(num + "*" + times + ":\t" + num * times);
            }
        }
    }
}
