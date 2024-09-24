import java.util.*;
public class NtoOneRecursion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number to start from");
        int N= sc.nextInt();
        int a=0;
        recur(N,a);
    }
    static  void recur(int N,int a){
        if(N<=a){
            return;
        }else{
            System.out.println(N);
            recur(N-1, a);
        }
    }
}
