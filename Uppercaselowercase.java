import java.util.*;
public class Uppercaselowercase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a= sc.next().charAt(0);
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
            if (a>='a'&&a<='z'){
                System.out.println("This is an lowercase alphabet");
            }else {
                    System.out.println("This is an Uppercase character");
                }
            }else {
                System.out.println("put invalid alphabet");
            }
        }
    }

