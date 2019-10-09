package it.polimi.ingsw2019.ex2;

import java.util.Date;

public class Person implements Comparable {

    private String name, surname;
    private Date birthday;

    public Person(String name, String surname, Date birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }


    @Override
    public int compareTo(Object o) {
        if (! (o instanceof Person)){
            return 0;
        }

        Person p = (Person) o;

        if (surname.compareTo(p.surname) == 1 ||
                (surname.compareTo(p.surname) == 0 &&
                        name.compareTo(p.name) == 1))
            return 1;
        else if (surname.compareTo(p.surname) == 0 &&
                name.compareTo(p.surname) == 0)
            return 0;


        return -1;
    }
}
