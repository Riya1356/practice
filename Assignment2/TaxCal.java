import java.util.Scanner;

public class TaxCal {
    public static void main(String[] args){

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter your Income");
        float num = sc.nextFloat();

        if(num>=2.5 && num <=6.0){
            System.out.println("Tax is : 10%");

        }else if (num>=6.0 && num<=12.0){
            System.out.println("Tax is : 18%");

        }else if (num>12.0){
            System.out.println("Tax is : 25%");

        }else if (num<2.5){
            System.out.println("There is no Tax");
        }
        else {
            System.out.println("out of range");
        }

    }
}
