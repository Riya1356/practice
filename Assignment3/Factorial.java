package Assignment3;

public class Factorial {
    public static void main(String args[]){

        int fact = 1,i;
        int num = 5;
       for (i=1;i<=num;i++){

           fact =fact*i;


       }
        System.out.println("Factorail of number "+num+"is :"+fact);
    }
}
