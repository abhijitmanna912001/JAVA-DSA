// https://practice.geeksforgeeks.org/problems/square-root/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
// I solved this using this logic.

public class NewtonRaphson {
    public static void main(String[] args) {
        double result = squareRoot(400);
        System.out.println("Square root: " + result);
    }

    public static double squareRoot(int num) {
        double tol = 0.0001;
        double root;
        double x = num;

        while (true) {
            root = 0.5 * (x + (num / x));
            double ans = x - root;
            if (ans < tol) {
                break;
            }
            x = root;
        }
        return root;
    }
}
