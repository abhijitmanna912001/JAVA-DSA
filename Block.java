public class Block {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        System.out.println("Static block initialized.");
        b = a * 7 + 2;
        System.out.println(b);
    }
}
