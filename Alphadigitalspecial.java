import java.util.*;
public class Alphadigitalspecial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);

        if ((a<='a'&& a<='z') || (a>='A'&&a<='Z')){
            System.out.println("This character is alphabet");
        } else if (a>=0 && a<=9) {
            System.out.println("this is a digit");
        }else {
            System.out.println("this is a special character");
        }
    }
}
