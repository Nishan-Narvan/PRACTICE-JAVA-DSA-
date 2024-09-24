import java.util.*;
public class Trianglevalidornot {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter first angle");
        int a =sc.nextInt();
        System.out.println("enter second angle");
        int b=sc.nextInt();
        System.out.println("enter third angle");
        int c=sc.nextInt();
        if ((a+b+c)==180){
            System.out.println("triangle is valid");
        }else {
            System.out.println("Triangle is not valid");
        }

    }
}
/*
 Chat gpt providing tolerance .abs function provides absolute difference
 public class TriangleValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle:");
        int a = sc.nextInt();
        System.out.println("Enter the second angle:");
        int b = sc.nextInt();
        System.out.println("Enter the third angle:");
        int c = sc.nextInt();

        // Define a tolerance for comparison
        int tolerance = 1; // You can adjust this value based on your requirements

        // Check if the sum of angles is approximately 180 degrees
        if (Math.abs(a + b + c - 180) <= tolerance) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }
    }*/