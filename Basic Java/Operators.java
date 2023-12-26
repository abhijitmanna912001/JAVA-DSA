public class Operators {
    public static void main(String[] args) {
        int op1 = 10;
        // op1--;
        int y = --op1;
        int x = ++op1;
        int z = op1++;
        int a = op1--;
        System.out.println(op1 + " " + x + " " + y + " " + z + " " + a);

        int p = op1++ + ++op1 - --op1 - op1++;
        System.out.println(p);

        boolean correct = true;
        System.out.println(correct);
        System.out.println(!correct);

        int val1 = 10;
        System.out.println(~val1);

        int val2 = -10;
        System.out.println(~val2);
    }
}
