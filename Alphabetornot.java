import java.util.*;



public class Alphabetornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character");
        char alpha=sc.next().charAt(0);
        if ((alpha>='a' && alpha <='z') || (alpha>='A' && alpha<='Z')){
            System.out.println("character is a Alphabet   ");
        }else {
            System.out.println("character is not a alphabet ");
        }
    }
}
