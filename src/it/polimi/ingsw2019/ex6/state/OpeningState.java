package it.polimi.ingsw2019.ex6.state;

public class OpeningState extends DoorState {

    public OpeningState(Door door) {
        super(door);
        System.out.println("Opening the door...");
    }

    @Override
    public void complete(){
        door.setState(new OpenState(door));
    }

    @Override
    public void touch(){
        door.setState(new ClosingState(door));
    }
}
