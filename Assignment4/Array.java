package Assignment4;

public class Array {
    public static void main(String args[]){

        int[] a = {10,20,30,40};
        int total=0;

        for(int i =0;i< a.length;i++){
            total=total+a[i];
        }
        double avg = total/a.length;
        System.out.println("Average is : "+avg);


    }
}
