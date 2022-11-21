package Assignment6;

 class Rectangle1 {


        private int length;

        private int width;

        Rectangle1(){

            this.length=0;

            this.width=0;

        }

        Rectangle1(int length, int width){

            this.length=length;

            this.width=width;

        }Rectangle1(int length){

            this.length=length;

            this.width=length;

        }

        int area(){

            return length*width;

        }

    }
    public class Rectangle{

        public static void main(String args[]){

            Rectangle1 r1= new Rectangle1();

            System.out.println("Area of r1: "+ r1.area());

            Rectangle1 r2= new Rectangle1(20,30);

            System.out.println("Area of r2: "+ r2.area());

            Rectangle1 r3= new Rectangle1(10);

            System.out.println("Area of r3: "+ r3.area());

        }

    }

