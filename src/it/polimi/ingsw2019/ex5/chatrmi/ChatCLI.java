package it.polimi.ingsw2019.ex5.chatrmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Vector;

public class ChatCLI implements UI {
    private BufferedReader inKeyboard;
    private ChatClientI client;
    private ChatServerI server;

    public ChatCLI() throws IOException, NotBoundException {
        inKeyboard = new BufferedReader(new InputStreamReader(System.in));
        connect();
        write();
    }

    public void connect() throws IOException, NotBoundException {
        System.out.println("Inserisci l'indirizzo del server");
        String ip = inKeyboard.readLine();
        System.out.println("Inserisci il tuo username");
        String username = inKeyboard.readLine();
        server = (ChatServerI) Naming.lookup("rmi://"+ip+"/chat");
        client = new ChatClient(this, username);
        server.login(client);
        showUsers();
    }

    private void showUsers() throws RemoteException {
        System.out.println("Gli utenti in chat sono: ");
        Vector<ChatClientI> users = server.getConnected();
        for (ChatClientI user : users){
            System.out.println(user.getUsername());
        }
    }

    private void write() throws IOException {
        while(true){
            String message = inKeyboard.readLine();
            server.publish("["+client.getUsername()+"] "+message);
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args){
        try {
            new ChatCLI();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

}
