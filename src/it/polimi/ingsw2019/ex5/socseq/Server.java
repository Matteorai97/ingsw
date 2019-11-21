package it.polimi.ingsw2019.ex5.socseq;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static int PORT = 3000;

    public Server(){

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server waiting on port "+PORT+"...");

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ServeOneClient(socket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
            try {
                serverSocket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

    }

    public static void main(String[] args){
        new Server();
    }

}
