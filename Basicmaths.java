import java.util.*;
public class Basicmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number to perform extraction on");
        int N = sc.nextInt();
        int count=0;
        int Count=0;
        while (N>0){
            int lastdigit=N%10;
            System.out.println(lastdigit);
            N=N/10;
            count++;
            if (N%lastdigit==0&& lastdigit !=0){
                Count++;
            }
        } System.out.println("The number of digits evenly dividing are are"+ Count);
    }
}
