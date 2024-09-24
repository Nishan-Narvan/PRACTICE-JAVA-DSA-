import java.util.*;
public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x=0;
        System.out.println("ENter numbe of units");
        double u= sc.nextDouble();
        if (u>=0&&u<=50){
            Double perunit = 0.50;
            Double psuedobill =(perunit)*u;
            System.out.println("Your electricity bill is" + (0.2*psuedobill)+psuedobill);
        }else if (u>50&&u<=150){
            Double perunit = 0.75;
            Double psuedobill =(perunit)*u;
            System.out.println("Your electricity bill is" + (0.2*psuedobill)+psuedobill);
        }else if (u>150&&u<=250) {
            Double perunit = 1.20;
            Double psuedobill =(perunit)*u;
            System.out.println("Your electricity bill is" + (0.2*psuedobill)+psuedobill);
        }else if (u>250) {
            Double perunit = 1.50;
            Double psuedobill =(perunit)*u;
            System.out.println("Your electricity bill is" + (0.2*psuedobill)+psuedobill);
        }
/*NAHI HUA YE QUESTION GALAT HAI ABHI BHI*/



    }
}
