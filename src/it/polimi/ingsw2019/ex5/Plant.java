package it.polimi.ingsw2019.ex5;

public class Plant implements Runnable {

    private enum State {
        OK, STOPPED, BUSY
    }

    private State state;

    public Plant(){
        state = State.OK;
    }

    @Override
    public void run() {

        while(state != State.STOPPED){
            System.out.println("Working...");
            while(Math.random() <= 0.8){
                System.out.println("Status OK!");
            }

            System.out.println("Plant is BUSY...");

            state = State.BUSY;

            Valve valve = new Valve();
            Thread valveThread = new Thread(valve);
            valveThread.start();

            synchronized (valve){
                try{
                    valve.wait(5000);
                }
                catch (InterruptedException e){

                }
            }

            if (valve.getState() == Valve.State.CLOSED){
                System.out.println("Failed");
                state = State.STOPPED;
            }
            else {
                System.out.println("Valve is opened, waiting...");
                try {
                    valveThread.join();
                }
                catch (InterruptedException e){

                }
                state = State.OK;
            }
        }

    }

    public static void main(String[] args){
        new Thread(new Plant()).start();
    }
}
