package it.polimi.ingsw2019.ex6.singleton;

public class PrinterManager {

    private static PrinterManager sharedInstance = new PrinterManager();

    private PrinterManager(){
        // ...
    }

    public static PrinterManager getSharedInstance(){
        return sharedInstance;
    }

}
