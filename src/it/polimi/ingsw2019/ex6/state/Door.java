package it.polimi.ingsw2019.ex6.state;

public class Door implements IDoor {

    private DoorState state;

    public Door(){
        state = new ClosedState(this);
    }

    @Override
    public void complete() {
        state.complete();
    }

    @Override
    public void touch() {
        state.touch();
    }

    @Override
    public void timeout() {
        state.touch();
    }

    public void setState(DoorState state){
        this.state = state;
    }


    public static void main(String[] args){
        Door door = new Door();
        door.touch();
        door.touch();
        door.touch();
        door.complete();
    }
}
