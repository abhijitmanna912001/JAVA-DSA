interface Shape {
    String name = "Abhijit";

    void display();

    void calculateArea();

    private void greetUser() {
        System.out.println("Welcome User");
    }

    default void printSome() {
        greetUser();
    }

    static void printName() {
        System.out.println("Name is " + name);
    }
}

interface intermediate {
    void fillArea();
}

class Circle implements intermediate, Shape {
    private final double pi = 3.14;
    int radius;

    Circle() {
        this.radius = 10;
    }

    public void display() {
        System.out.println("Shape is circle");
    }

    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println(area);
    }

    public void fillArea() {
        System.out.println("Filled");
    }

}

public class Interface {
    public static void main(String[] args) {
        Circle ci = new Circle();
        ci.calculateArea();
        ci.display();
        ci.printSome();

        Shape sh = new Circle();
        sh.printSome();
    }
}
