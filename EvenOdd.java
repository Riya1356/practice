public class EvenOdd {
    public static void main(String[] args) {

        int n = 100;
        System.out.println("List of Even Numbers :-");

        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");

            }


        }

        System.out.println("\nList of Odd Numbers :-");

        for (int i = 0; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }
    }
}
