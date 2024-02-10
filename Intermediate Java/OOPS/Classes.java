class Car {
    String brand;
    String color;
    String model;
    int speed;
    boolean isABSPresent;

    // constructor
    Car(String brand, String color, String model, boolean isAbs, int speed) {
        System.out.println("Init");
        this.brand = brand;
        this.color = color;
        this.model = model;
        isABSPresent = isAbs;
        this.speed = speed;
        System.out.println("Init done");
    }

    Car() {
        System.out.println("Default constructor");
        this.brand = "Maruti";
        this.model = "Swift";
        this.speed = 80;
        this.color = "black";
        this.isABSPresent = false;
    }

    Car(Car newCar) {
        this.speed = newCar.speed;
        this.isABSPresent = newCar.isABSPresent;
        this.color = newCar.color;
        this.model = newCar.model;
        this.brand = newCar.brand;
        System.out.println("Copy constructor invoked");
    }

    public void Drive() {
        System.out.println("Driving");
    }

    public void SpeedUp(int newSpeed) {
        speed = newSpeed;
        System.out.println("Speed increase");
    }
}

public class Classes {
    public static void main(String[] args) {
        // Car obj;
        // default constructor
        Car obj = new Car(); // object is allocated in heap memory
        System.out.println("Speed: " + obj.speed);
        // Parameterized constructor
        Car obj2 = new Car("Ford", "blue", "Ecosports", true, 100);
        System.out.println("Speed: " + obj2.speed);
        // Copy constructor
        Car obj3 = new Car(obj2); // deep copy - copy the values
        System.out.println("Speed: " + obj3.speed);
        obj2.speed = 90;
        System.out.println("Speed: " + obj2.speed);
        System.out.println("Speed: " + obj3.speed);
        // same reference -> shallow copy - copy the reference
        Car obj4 = obj2;
        System.out.println("Object 2 Speed: " + obj2.speed);
        System.out.println("Object 4 Speed: " + obj4.speed);
        obj2.speed = 120;
        System.out.println("Object 2 Speed: " + obj2.speed);
        System.out.println("Object 4 Speed: " + obj4.speed);
    }
}