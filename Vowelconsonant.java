import java.util.*;
public class Vowelconsonant {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      char a = sc.next().charAt(0);
      if ((a>='a' && a<='z' ) || (a>='A' && a<='Z')){
          if ((a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u') ||
                  (a == 'A') || (a == 'E') || (a == 'I') || (a == 'O') || (a == 'U')) {
              System.out.println("It's a vowel");

          }else {
              System.out.println("Its a consonant");
          }
        }else {
          System.out.println("Invalid character");
      }
    }
}
