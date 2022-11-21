package Assignment6;


    class student{
        String ss;
        String name;
        public student(String ss){
            name = ss;
        }
        public student()
        {
            name = "unknown";
        }
    }
    public class Overloading{
        public static void main(String[] args) {
            student obj = new student();
            obj.ss = "Riya";
            System.out.println(obj.ss);
            System.out.println(obj.name);

        }
    }

