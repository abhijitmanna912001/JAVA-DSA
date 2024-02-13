// Inheritance - is a relationship
// single

// class Terminator1 {
//     String pname;
//     int page;

//     public void displayParent() {
//         System.out.println("Parent name is " + pname);
//     }

//     // data hiding - restricting
//     private void displayAge() {
//         System.out.println("Parent age is " + page);
//     }
// }

// class Child extends Terminator1 {
//     String cname;
//     int cage;

//     public void displayChild() {
//         System.out.println("Child name is " + cname);
//     }
// }

// public class Inheritance {

//     public static void main(String[] args) {
//         Terminator1 t1 = new Terminator1();
//         t1.pname = "Abhijit";
//         t1.displayParent();
//         Child c1 = new Child();
//         c1.pname = "Hello";
//         c1.displayParent();
//         c1.displayChild();
//     }
// }

// Multi Level Inheritance
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

class Child1 extends Terminator1 {
    String c1name;
    int c1age;

    public void displayChild1() {
        System.out.println("Child1 name is " + c1name);
    }

    public void displayAge1() {
        System.out.println("Child1 age is " + c1age);
    }
}

class Child2 extends Child1 {
    String c2name;
    int c2age;

    public void displayChild2() {
        System.out.println("Child2 name is " + c2name);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Terminator1 t2 = new Terminator1();
        t2.pname = "Abhijit";
        t2.displayParent();
        Child1 c1 = new Child1();
        c1.pname = "Hello";
        c1.displayParent();
        c1.displayChild1();
        Child2 c2 = new Child2();
        c2.pname = "World";
        c2.displayParent();
    }
}
