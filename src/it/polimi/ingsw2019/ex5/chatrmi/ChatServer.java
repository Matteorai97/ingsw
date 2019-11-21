package it.polimi.ingsw2019.ex5.chatrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class ChatServer extends UnicastRemoteObject implements ChatServerI {

    public ChatServer() throws RemoteException {}
    Vector<ChatClientI> users = new Vector();

    @Override
    public boolean login(ChatClientI client) throws RemoteException {
        client.receive("You are connected in this chat");
        publish(client.getUsername()+" joined this chat");
        users.add(client);
        return true;
    }

    @Override
    public void publish(String message) throws RemoteException {
        for (ChatClientI user : users){
            user.receive(message);
        }
    }

    @Override
    public Vector<ChatClientI> getConnected() throws RemoteException {
        return users;
    }
}
