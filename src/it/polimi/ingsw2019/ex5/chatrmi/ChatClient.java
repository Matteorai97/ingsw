package it.polimi.ingsw2019.ex5.chatrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatClient extends UnicastRemoteObject implements ChatClientI {

    private UI ui;
    private String username;

    public ChatClient(UI ui, String username) throws RemoteException {
        this.ui = ui;
        this.username = username;
    }

    @Override
    public void receive(String message) throws RemoteException {
        ui.showMessage(message);
    }

    @Override
    public String getUsername() throws RemoteException {
        return username;
    }
}
