package it.polimi.ingsw2019.ex4;

public class Consumer implements Runnable{

    private Account account;
    private final int time, max;

    public Consumer(Account a, int t, int m){
        account = a;
        time = t; // seconds
        max = m;

    }

    @Override
    public void run() {
        while(true){
            int amount = (int) (Math.random()*max);
            account.collect(amount);
            System.out.println("Ho prelevato "+amount);
            try {
                Thread.sleep(time * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
