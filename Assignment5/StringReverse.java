package Assignment5;

 class StringFormatter {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}

public class StringReverse {
    public static void main(String args[]){
        System.out.println(StringFormatter.reverseString("Consultadd"));

    }
}
