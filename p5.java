import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter your number");
    int N =sc.nextInt();
    for(int i=0;i<N;i++){
        for (int j = N; j>0; j--){
            System.out.print("*_");
        }
        System.out.println();
    }
}
}
