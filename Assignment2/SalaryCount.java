import java.util.Scanner;

public class SalaryCount {
    public static void main(String[] args){

        float grosspayment;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        float bs = sc.nextFloat();
        System.out.println("Enter the DA of Employee");
        float da= sc.nextFloat();
        System.out.println("enter the HRA of employee");
        float hra= sc.nextFloat();

         float da1 =(da*bs)/100;
         float hra1=(hra*bs)/100;


            grosspayment=bs+da1+hra1;
            System.out.println("Gross salray of employee is : "+grosspayment);






    }
}
