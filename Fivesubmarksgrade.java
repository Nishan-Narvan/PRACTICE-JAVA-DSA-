import java.util.*;
public class Fivesubmarksgrade {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics marks");
        float P = sc.nextInt();
        System.out.println("Enter Chemistry marks");
        float C = sc.nextInt();
        System.out.println("Enter Biology marks");
        float B = sc.nextInt();
        System.out.println("Enter Mathematics marks");
        float M = sc.nextInt();
        System.out.println("Enter Computer marks");
        float Cm = sc.nextInt();
        float D;
        D=((P+C+B+M+Cm)/500)*100;
        if (D>=90){
            System.out.println("grade A");
        } else if (D>=80) {
            System.out.println("grade B");
        }else if (D>=70){
            System.out.println("grade C");
        }else if (D>=60){
            System.out.println("grade D");
        }else if (D<40) {
            System.out.println("grade E");

        }

    }
}
