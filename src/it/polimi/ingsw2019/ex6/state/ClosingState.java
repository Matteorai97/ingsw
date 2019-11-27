package it.polimi.ingsw2019.ex6.state;

public class ClosingState extends DoorState {
    public ClosingState(Door door) {
        super(door);
        System.out.println("Door is closing...");
    }

    @Override
    public void complete() {
        door.setState(new ClosedState(door));
    }

    @Override
    public void touch() {
        door.setState(new OpeningState(door));
    }
}
