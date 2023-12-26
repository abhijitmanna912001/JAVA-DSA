public class MyFunc {
    public static void main(String[] args) {
        MyFunc mf = new MyFunc();

        int num1 = 30;
        int num2 = 20;
        mf.swap(num1, num2);
        // System.out.println(num1 + "," + num2);
        // int res = mf.calculateArea(5, 2);
        // System.out.println(res);
    }

    public void swap(int val1, int val2) {
        System.out.println(val1 + "," + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }

    public int calculateArea(int length, int breadth) {
        // System.out.println(length * breadth);
        int area = length * breadth;
        return area;
    }
}
