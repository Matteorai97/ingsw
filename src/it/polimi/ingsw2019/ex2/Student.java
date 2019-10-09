package it.polimi.ingsw2019.ex2;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {

    private String id;
    private ArrayList<Grade> grades;

    public Student(String name, String surname, Date birthday, String id){
        super(name, surname, birthday);
        this.id = id;
        grades = new ArrayList<Grade>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public int getTotalCredits(){
        int credits = 0;

        for (Grade g : grades){
            credits += g.getCredits();
        }

        return credits;
    }

    public boolean canGraduate(){
        return getTotalCredits() >= 180;
    }

    public double getWeightedAverage(){
        double avg = 0;

        for (Grade g : grades){
            avg += g.getPoints()*g.getCredits();
        }

        return avg/getTotalCredits();
    }

    public String toString(){
        return getName()+" "+getSurname()+" - "+id;
    }

    @Override
    public int compareTo(Object o) {

        int i = super.compareTo(o);

        if (i != 0){
            return i;
        }

        if (o instanceof Student){
            Student s = (Student) o;
            return id.compareTo(s.id);
        }

        return 0;

    }
}
