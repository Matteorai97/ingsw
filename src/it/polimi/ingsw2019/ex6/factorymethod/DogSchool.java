package it.polimi.ingsw2019.ex6.factorymethod;

public class DogSchool extends PetSchool {

    public DogSchool(){
        /*
        pets = new ArrayList<>();
        for (int i = 0; i < PetSchool.N; i++){
            pets.add(new Dog());
        }
        */
    }

    @Override
    protected Pet createStudent() {
        return new Dog();
    }
}
