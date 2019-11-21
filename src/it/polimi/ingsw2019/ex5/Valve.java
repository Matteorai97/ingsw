package it.polimi.ingsw2019.ex5;

public class Valve implements Runnable {

    public enum State {
        OPENED, CLOSED
    }

    private State state;

    public Valve(){
        state = State.CLOSED;
    }

    public State getState() {
        return state;
    }

    @Override
    public void run() {
        System.out.println("Opening...");

        double time = 8000 * Math.random();

        try {
            Thread.sleep((long) time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            state = State.OPENED;
            notify();
        }

        System.out.println("Valve opened after "+time+"ms");

        time = 5000 + 5000 * Math.random();

        System.out.println("Valve should wait "+time+"ms");

        try {
            Thread.sleep((long) time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        state = State.CLOSED;
        System.out.println("Valve is now closed");

    }



}
