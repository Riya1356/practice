import java.util.Scanner;


public class SwitchBlock {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for choices from 1,2,3");
        int Demo = sc.nextInt();

        System.out.println("enter the number first number: ");
        int num1= sc.nextInt();

        System.out.println("enter the second number: ");
        int num2=sc.nextInt();

        switch (Demo){
            case 1:
                int result= num1-num2;
                System.out.println("Addition  "+ result);
                break;

            case 2:
                int result1= num1-num2;
                System.out.println("Subtraction "+ result1);
                break;
            case 3:
                int result2= num1*num2;
                System.out.println("Multiplication "+ result2);
                break;
            default:
                System.out.println("out of case range");
        }
    }
}
