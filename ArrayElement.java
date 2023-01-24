import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element you want to store:-");
        int n =sc.nextInt();
        int[] array =new int[10];
        System.out.println("Enter the number of element for Array:-");

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.println("Number of Array Elements you Entered is :-"+array[i]);

        }

    }


}
