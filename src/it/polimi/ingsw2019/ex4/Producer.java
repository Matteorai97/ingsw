package it.polimi.ingsw2019.ex4;

public class Producer implements Runnable {

    private Account account;
    private final int time, max;

    public Producer(Account a, int t, int m){
        account = a;
        time = t; // seconds
        max = m;

    }

    @Override
    public void run() {
        while(true){
            int amount = (int) (Math.random()*max);
            account.deposit(amount);
            System.out.println("Ho depositato "+amount);
            try {
                Thread.sleep(time * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
