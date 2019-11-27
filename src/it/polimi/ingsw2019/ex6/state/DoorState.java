package it.polimi.ingsw2019.ex6.state;

public abstract class DoorState implements IDoor {

    protected Door door;

    public DoorState(Door d){
        door = d;
    }

    @Override
    public void complete() {

    }

    @Override
    public void touch() {

    }

    @Override
    public void timeout() {

    }
}
