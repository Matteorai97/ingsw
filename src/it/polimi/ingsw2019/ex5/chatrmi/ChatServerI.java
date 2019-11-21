package it.polimi.ingsw2019.ex5.chatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface ChatServerI extends Remote {

     boolean login(ChatClientI client) throws RemoteException;
     void publish(String message) throws RemoteException;
     Vector getConnected() throws RemoteException;
}
