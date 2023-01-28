package process;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    Person person;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
