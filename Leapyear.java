
import java.util.*;

public class Leapyear {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  month number");
        int month = sc.nextInt();
        switch (month) {
            case 1: case 3: case 5: case 7: case 9: case 11:
                System.out.println("This month has 31 days");
                break;
            case 4: case 6: case 8: case 10: case 12:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("enter the year");
                int v=sc.nextInt();
                if((v%4==0 && v%100!=0) || (v%400==0)){
                    System.out.println("This month has 29 days");
                }else {
                    System.out.println("This month has 28 days");
                      }


                      }
    }
}

