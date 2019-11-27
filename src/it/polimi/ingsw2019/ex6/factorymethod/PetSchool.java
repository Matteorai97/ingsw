package it.polimi.ingsw2019.ex6.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class PetSchool {

    List<Pet> pets;
    static final int N = 50;

    public PetSchool(/*String petType*/){

        pets = new ArrayList<>();
        for (int i = 0; i < PetSchool.N; i++){
            pets.add(createStudent());

            /* ANTIPATTERN 1
            if (petType.equals("Dog"))
                pets.add(new Dog());
            else if (petType.equals("Cat"))
                pets.add(new Cat());
            */
            /* ANTIPATTERN 2
            if (this instanceof DogSchool)
                pets.add(new Dog());
            else if (this instanceof CatSchool)
                pets.add(new Cat());
            */
        }
    }

    abstract protected Pet createStudent();
}
