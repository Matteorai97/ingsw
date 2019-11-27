package it.polimi.ingsw2019.ex6.factorymethod;

public class CatSchool extends PetSchool{

    public CatSchool(){
        /*
        pets = new ArrayList<>();
        for (int i = 0; i < PetSchool.N; i++){
            pets.add(new Cat());
        }
        */
    }

    @Override
    protected Pet createStudent() {
        return new Cat();
    }

}
