package it.polimi.ingsw2019.ex3;

public class PrintAction implements Actionable {

    private String message;

    public PrintAction(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }


}
