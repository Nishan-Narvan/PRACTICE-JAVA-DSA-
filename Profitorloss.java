import java.util.*;
public class Profitorloss {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount at which u sold");
        double a = sc.nextDouble();
        System.out.println("Enter the amount at which u bought");
        double b= sc.nextDouble();
        Double ans=((a-b)/b)*100;
        System.out.println("The net profit/loss percentage is" + ""+ans);




    }
}
/*For more control over the output , i need to provide two decimal places sousing
* System.out.println("The net profit/loss percentage is: " + String.format("%.2f%%", profitOrLossPercentage));

 *
*
*
*
*
*
*
*
* */
