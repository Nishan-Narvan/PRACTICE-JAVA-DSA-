import java.util.*;
class ExtraWork {
//    public static void main(String[] args){
//        int b =1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Number");
//
//        int N=sc.nextInt();
//        printGfg(b,N);
//    }
//
//
//    static void printGfg(int a,int N) {
//        if(a>N){
//            return;
//
//        }else {
//            System.out.println("GFG");
//            printGfg(a+1, N);
//            // code here
//        }
//    }
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