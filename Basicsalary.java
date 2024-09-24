
import java.util.*;
public class Basicsalary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Basic salary");
        double b= sc.nextDouble();


        double HRA=0;
        double DA=0;


        if(b<=10000){
            HRA =0.2*b;
            DA = 0.8*b;

        }else if(b<=20000){
            HRA =0.25*b;
            DA = 0.90*b;

        }else if(b>20000) {
            HRA = 0.3 * b;
            DA = 0.95 * b;

        }

        System.out.println("Your salary is" + (b + HRA + DA));
    }
}
