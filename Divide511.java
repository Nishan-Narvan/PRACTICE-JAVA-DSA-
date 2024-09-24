import java.util.*;
public class Divide511 {
    public static void main (String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a= sc.nextInt();
        if(a%11==0 && a%5==0){
            System.out.println("Number is divisible by 5 nd 11");
        }else {
            System.out.println("number is not divisible by 5 and 11");
        }
    }
}
