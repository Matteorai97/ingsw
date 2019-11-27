package it.polimi.ingsw2019.ex6.state;

public class ClosedState extends DoorState {

    public ClosedState(Door d) {
        super(d);
        System.out.println("Door is closed");
    }

    @Override
    public void touch(){
        door.setState(new OpeningState(door));
    }
}
