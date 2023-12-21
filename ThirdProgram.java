import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your firstName");
        String firstName = sc.next();
        // String name = sc.nextLine();

        System.out.println("Hi " + firstName);

        sc.close();
    }
}
