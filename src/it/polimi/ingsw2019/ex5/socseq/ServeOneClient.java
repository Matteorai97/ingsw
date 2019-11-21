package it.polimi.ingsw2019.ex5.socseq;

import java.io.*;
import java.net.Socket;

public class ServeOneClient implements Runnable {

    private Socket socket;
    private BufferedReader inSocket;
    private PrintWriter outSocket;

    public ServeOneClient(Socket socket){
        System.out.println("Client connected");
        this.socket = socket;
        try {
            inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outSocket = new PrintWriter(new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

       try {
           login();
           manageClient();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           close();
       }

    }

    public void login(){

    }

    public void manageClient() throws IOException {
        // play
        // record
        play();
    }

    public void play() throws IOException {
        boolean ok = true;
        int l = 1;

        while(ok){
            String seq = generateSequence(l);
            outSocket.println(seq);
            String clientSeq = inSocket.readLine();
            if (seq.equals(clientSeq))
                outSocket.println("true");
            else {
                outSocket.println("false");
                ok = false;
            }
            l++;
        }
    }

    public void showRecords(){

    }

    public void close(){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateSequence(int len){

        String res = "";

        for (int i = 0; i < len; i++){
            int num = (int) (Math.random()*10);
            res += num;
        }

        return res;

    }
}
