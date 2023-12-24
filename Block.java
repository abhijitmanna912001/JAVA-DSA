import com.college.MyMain;

public class Block {
    static int a = 0;
    static int b;
    static {
        b = b + 10;
    }

    static class ChotaMain {

        static void print() {
            System.out.println(b);
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        // int a = 2;
        // int b = 0;

        // System.out.println("Static block initialized.");
        // b = a * 7 + 2;
        // System.out.println(b);

        System.out.println(MyMain.b);
        // MyMain m = new MyMain();t
        // System.out.println(m.b+m.a);
    }
}
