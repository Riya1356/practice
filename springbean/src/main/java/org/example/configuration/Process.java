package org.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import process.Person;
import process.Vehicle;

@Configuration
@ComponentScan(basePackages = "org.example.process")
public class Process {

    @Bean
    Vehicle vehicle(){
        Vehicle vh =new Vehicle();
        vh.setName("Tesla");
        return vh;
    }
    @Bean
    Person person(){
        Person p = new Person();
        p.setName("john");
        return p;
    }


}
