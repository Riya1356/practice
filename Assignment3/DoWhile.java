package Assignment3;
import java.util.Scanner;


public class DoWhile {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int sum= num1+num2;
        System.out.println("Addition of numbers is :"+sum);


        char choice;


        do {
            System.out.println("want to repeat again??? y/n??");
            choice = sc.next().charAt(0);

            sum=num1+num2;
            System.out.println("second time addition is : "+sum);
        }while(choice== 'y' || choice=='Y');

    }
}
