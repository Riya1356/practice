import java.util.Scanner;

public class JumpStatement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        while(num<0){
            System.out.println("its over");
            break;
        }
        if(num>0){
            System.out.println("Good Going");
        }




    }
}
