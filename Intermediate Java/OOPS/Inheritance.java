// Inheritance - is a relationship
// single

class Terminator1 {
    String pname;
    int page;

    public void displayParent() {
        System.out.println("Parent name is " + pname);
    }

    // data hiding - restricting
    private void displayAge() {
        System.out.println("Parent age is " + page);
    }
}

class Child extends Terminator1 {
    String cname;
    int cage;

    public void displayChild() {
        System.out.println("Child name is " + cname);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Terminator1 t1 = new Terminator1();
        t1.displayParent();
        Child c1 = new Child();
        c1.displayParent();
        c1.displayChild();
    }
}
