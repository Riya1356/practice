package Assignment7;
import java.util.*;
public class HashMap {




            static Map<String, Integer> map = new HashMap<>();


        public static void sortbykey()
        {

            TreeMap<String, Integer> sorted = new TreeMap<>();


            sorted.putAll(map);


            for (Map.Entry<String, Integer> entry : sorted.entrySet())
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
        }


        public static void main(String args[])
        {

            map.put("Riya", 80);
            map.put("Abhishek", 90);
            map.put("Romil", 80);
            map.put("Mona", 75);
            map.put("Bonny", 40);


            sortbykey();
        }
    }


