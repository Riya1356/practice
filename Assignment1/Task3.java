public class Task3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("numbers before swap:" + " num1= " + num1 + " num2= " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap: " +  " num1= " + num1 + " num2= " + num2);

        int x = 25;
        int y = 55;
        System.out.println("before swap:" + " X= " + x + " Y= " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after swap:" + " X= " + x + " Y= " + y);


    }

}
