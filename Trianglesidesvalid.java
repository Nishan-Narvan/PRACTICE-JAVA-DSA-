import java.util.*;
public class Trianglesidesvalid {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first side");
        int a =sc.nextInt();
        System.out.println("enter second side");
        int b=sc.nextInt();
        System.out.println("enter third side");
        int c= sc.nextInt();
        if(a==b&&b==c){
            System.out.println("triangle is equilateral");
        } else if (a==b&&b!=c) {
            System.out.println("isoscales");
        }else {
            System.out.println("Triangle is scalene");}


    }
}
/*For a triangle to be valid just by its sides,the sum of two must be greater than the third,a+b>c,b+c>a,a+c>b*/