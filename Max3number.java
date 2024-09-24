import java.util.Scanner;

public class Max3number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("enter your second number");
        int b=sc.nextInt();
        System.out.println("Enter your third number");
        int c=sc.nextInt();
        int max;
        if (a>b){
            max=a;
        }else {max=b;}
        if (max>c){
            System.out.println("The maximum number is "+ max);
        }else {
            System.out.println("The maximum number is "+ c);
        }




    }
}
