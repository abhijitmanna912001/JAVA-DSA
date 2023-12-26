public class MyFunc {
    public static void main(String[] args) {
        MyFunc mf = new MyFunc();
        int res = mf.calculateArea(5, 2);
        System.out.println(res);
    }

    public int calculateArea(int length, int breadth) {
        // System.out.println(length * breadth);
        int area = length * breadth;
        return area;
    }
}
