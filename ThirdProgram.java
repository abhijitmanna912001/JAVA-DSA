import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your firstName");
        String firstName = sc.next();
        System.out.println("What is your age");
        int age = sc.nextInt();

        // String name = sc.nextLine();

        System.out.println("Hi " + firstName + " you are " + age + " years old");

        sc.close();
    }
}
