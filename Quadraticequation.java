import java.util.*;
public class Quadraticequation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a of equation");
        int a = sc.nextInt();
        System.out.println("Enter b of equation");
        int b = sc.nextInt();
        System.out.println("Enter c of equation");
        int c = sc.nextInt();
        int D;
        D = (b * b) - 4 * a * c;
        if (D < 0) {
            System.out.println("The roots are imaginary");
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The root are equal which is" + root);

        } else if (D > 0) {

        }

        double roots1 = (-b + Math.sqrt(D)) / (2 * a);
        double roots2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("the roots are real which are" + roots1 + roots2);

    }
}