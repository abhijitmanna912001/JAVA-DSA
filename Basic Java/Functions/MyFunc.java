class Temp {
    int myVar = 10;
}

public class MyFunc {
    public static void main(String[] args) {
        MyFunc mf = new MyFunc();

        Temp obj1 = new Temp();
        Temp obj2 = new Temp();

        obj1.myVar = 10;
        obj2.myVar = 20;
        mf.swapByReference(obj1, obj2);
        System.out.println("After call " + obj1.myVar + "," + obj2.myVar);

        // int num1 = 30;
        // int num2 = 20;
        // mf.swap(num1, num2);
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

    public void swapByReference(Temp obj1, Temp obj2) {
        System.out.println(obj1.myVar + "," + obj2.myVar);
        int temp = obj1.myVar;
        obj1.myVar = obj2.myVar;
        obj2.myVar = temp;
        System.out.println(obj1.myVar + "," + obj2.myVar);
    }

    public int calculateArea(int length, int breadth) {
        // System.out.println(length * breadth);
        int area = length * breadth;
        return area;
    }
}
