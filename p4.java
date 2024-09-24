import java.util.Scanner;



public class p4{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter your number");
        int N =sc.nextInt();
        for(int i=1;i<N;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


