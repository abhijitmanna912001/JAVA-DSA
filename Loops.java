public class Loops {
    public static void main(String[] args) {
        int len = 8;
        for (int pos = 1; pos < len; pos++) {
            if (pos % 2 == 0) {
                break;
            }

            System.out.println(pos);
        }
    }
}
