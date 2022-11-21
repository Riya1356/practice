package Assignment7;

public class LargestElement {



        static int arr[] = {10, 96, 45, 8, 65};


        static int largest()
        {
            int i;


            int max = arr[0];


            for (i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];

            return max;
        }


        public static void main(String[] args)
        {
            System.out.println("Largest in given array is " + largest());
        }
    }


