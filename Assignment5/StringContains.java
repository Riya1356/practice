package Assignment5;

public class StringContains {
        public static void main(String[] args) {
            // create a string
            String txt = "This is Demo";
            String str1 = "demoss";



            boolean result = txt.contains(str1);
            if(result) {
                System.out.println(str1 + " is present in the string.");
            }
            else {
                System.out.println(str1 + " is not present in the string.");
            }


        }
    }



