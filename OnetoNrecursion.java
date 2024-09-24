import java.util.Scanner;

public class OnetoNrecursion {
    public static void main(String[] args){
        Scanner dc=new Scanner(System.in);
        System.out.println("Enter your number upto which u want to be printed");
        int N=dc.nextInt();
        int s=1;
        printNos(s,N);
    }

    static void printNos(int a,int N) {
        if(a>N){
            return;
        }else{
            System.out.println(a );
            printNos(a+1,N);
        }

    }
}
