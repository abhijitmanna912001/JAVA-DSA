class Terminator1 {
    String pname;
    String name;
    int age;

    Terminator1() {
        System.out.println("Constructor of parent");
    }

    Terminator1(String pname) {
        this.name = pname;
        System.out.println("Parameterized Constructor of parent");
    }

    public void display() {
        System.out.println("Parent name is " + name);
    }

    public void display2() {
        System.out.println("Parent2 name is " + pname);
    }

    // data hiding-restricting

    private void displayAge() {
        System.out.println("Parent age is " + age);
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Child extends Terminator1 {
    String cname;
    String name;
    int age;

    Child() {
        System.out.println("Constructor of Child");
    }

    Child(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor of Child");
    }

    public void display() {
        System.out.println("Child name is " + name);
    }

    final public void display2() {
        System.out.println("Child2 name is " + cname);
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Terminator1 t1 = new Terminator1();
        t1.display();

        Terminator1 t2 = new Child();
        t2.display();

        // t2.name = "Abhijit";
        t2.setName("Abhijit");
        t2.display();
        t2.display2();

        Child ch = new Child();
        ch.display2();
    }
}
