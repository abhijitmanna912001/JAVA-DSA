class Outer {
    static int rollNumber;
    String name;
    private int age;
    int data;

    Outer() {
        rollNumber = 100;
        this.name = "Abhijit";
        this.age = 23;
        this.data = 10;
        System.out.println("Init Outer");
    }

    public void displayData() {
        System.out.println("Outer Data is " + data);
        Inner obj = new Inner();
        System.out.println("Inner Data is " + obj.data);
        System.out.println("Inner rollNumber is " + Inner.rollNumber);
    }

    class Inner {
        static int rollNumber;
        static String name;
        int data;

        Inner() {
            name = "Inner";
            this.data = 30;
            System.out.println("Init inner");
        }

        Inner(int data) {
            name = "inner";
            this.data = data;
        }

        public void displayData() {
            System.out.println("Data is: " + data);
            System.out.println("Outer data is: " + Outer.this.data);
            System.out.println("Outer age is: " + Outer.this.age);
            Outer.this.displayData();
        }

        public void displayRollNumber() {
            System.out.println("Outer RollNumber is: " + Outer.rollNumber);
            System.out.println("Inner RollNumber is: " + rollNumber);
        }
    }

    class InnerNew extends Inner {

    }
}

class Fan {
    void display() {
        System.out.println("Outer display");

        class InnerFan {
            void display() {
                System.out.println("Inner display");
            }
        }

        InnerFan f = new InnerFan();
        f.display();
    }
}

class Normal {
    void display() {
        System.out.println("This is normal class");
    }
}

abstract class NoName {
    abstract void display();

    abstract void print();
}

interface NoGame {
    void display();
}

class OuterNonStatic {
    static int age;
    String name;

    static class InnerStatic {
        void display() {
            age = 23;
            System.out.println("Non static method inside static inner class");
        }
    }

    static class InnerSecondStatic {
        static void display() {
            System.out.println("Static method inside static inner class");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner innerObject = obj.new Inner();

        obj.displayData();
        innerObject.displayData();

        NoName nn = new NoName() {
            void display() {
                System.out.println("Anonymous class");
            }

            void print() {
                System.out.println("Printed class");
            }
        };

        nn.display();
        nn.print();

        NoGame ng = new NoGame() {
            public void display() {
                System.out.println("No Game");
            }
        };

        ng.display();

        OuterNonStatic ons = new OuterNonStatic();
        OuterNonStatic.InnerStatic obj2 = new OuterNonStatic.InnerStatic();
        obj2.display();

        OuterNonStatic.InnerSecondStatic.display();
        OuterNonStatic.InnerSecondStatic obj3 = new OuterNonStatic.InnerSecondStatic();
    }
}