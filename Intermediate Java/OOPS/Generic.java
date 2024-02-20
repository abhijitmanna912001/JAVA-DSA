class Displayer2 {
    Object num;

    public void setNum(Object num) {
        this.num = num;
    }

    public void display() {
        System.out.println("element -> " + this.num);
    }
}

class College {
    void printCollegeName() {
        System.out.println("SRMIST");
    }
}

class Student extends College {
    void printName() {
        System.out.println("Student Name printed");
    }
}

class Teacher extends College {
    void printName() {
        System.out.println("Teacher Name printed");
    }
}

class Displayer<T extends College> {
    T num;

    public void setNum(T num) {
        this.num = num;
        this.num.printCollegeName();
    }

    public void display() {
        System.out.println("element -> " + this.num);
    }
}

class IntegerDisplayer {
    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public void display() {
        System.out.println("element -> " + this.num);
    }
}

class DoubleDisplayer {
    Double num;

    public void setNum(Double num) {
        this.num = num;
    }

    public void display() {
        System.out.println("element -> " + this.num);
    }
}

public class Generic {
    public <E> void heyGen(E element) {
        System.out.println("Hi generics " + element);
    }

    public static void main(String[] args) {
        // IntegerDisplayer obj = new IntegerDisplayer();
        // obj.setNum(20);
        // obj.display();

        // DoubleDisplayer obj1 = new DoubleDisplayer();
        // obj1.setNum(20.0);
        // obj1.display();

        // Displayer<Integer> obj2 = new Displayer<>();
        // obj2.setNum(20);
        // obj2.display();

        // Displayer<Double> obj3 = new Displayer<>();
        // obj3.setNum(20.0);
        // obj3.display();

        // Displayer2 d2 = new Displayer2();
        // d2.setNum(20);
        // d2.setNum(20.0);
        // d2.display();

        Generic mg = new Generic();
        mg.heyGen("Abhijit");

        Displayer<Student> obj2 = new Displayer<>();
        obj2.setNum(new Student());
        obj2.display();

        Displayer<Teacher> obj3 = new Displayer<>();
        obj3.setNum(new Teacher());
        obj3.display();
    }
}
