package it.polimi.ingsw2019.ex7;

public interface Observable {

    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();


}
