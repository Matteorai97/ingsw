package it.polimi.ingsw2019.ex5.chatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientI extends Remote {
    void receive(String message) throws RemoteException;
    String getUsername() throws RemoteException;
}
