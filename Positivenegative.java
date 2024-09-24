import java.util.*;
public class Positivenegative{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("number is positive");
        }else if (a<0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }



    }
}
