package org.example;
import org.example.configuration.Process;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import process.Vehicle;



public class Main
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(String.valueOf(Process.class));
        Vehicle vh=(Vehicle)context.getBean(Vehicle.class);
        System.out.println("The vehicle name is :-"+ vh.getName());
        System.out.println("The person name is :-"+vh.getPerson());

        Vehicle vh1 = new Vehicle();
        vh1.setName("Honda");
        System.out.println("The Vehicle is:- "+vh1.getName());
    }
}