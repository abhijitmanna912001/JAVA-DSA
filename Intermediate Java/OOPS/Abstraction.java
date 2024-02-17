abstract class Bank {
    static String message;

    Bank() {
        message = "Sir";
        System.out.println("This is a constructor");
    }

    abstract int rateOfInterest();

    final void display() {
        System.out.println("Welcome to our bank, " + message);
    }
}

class Pnb extends Bank {
    int rateOfInterest() {
        return 10;
    }
}

class Sbi extends Bank {
    int rateOfInterest() {
        return 9;
    }
}

abstract class Hdfc extends Bank {
    void print() {
        System.out.println("Hi HDFC");
    }
}

class NewBank extends Hdfc {
    int rateOfInterest() {
        return 11;
    }

}

public class Abstraction {
    public static void main(String[] args) {
        // Pnb p = new Pnb();
        Bank b1 = new Pnb();
        System.out.println(b1.rateOfInterest());

        Bank b2 = new Sbi();
        System.out.println(b2.rateOfInterest());

        Bank b3 = new NewBank();
        System.out.println(b3.rateOfInterest());
    }
}
