package it.polimi.ingsw2019.ex3;

public abstract class SecureString {

    private String s;

    public SecureString(String s){
        this.s = s;
    }

    abstract protected boolean isSafe(Object o);

    public void securePrint(Object o){
        if(this.isSafe(o))
            System.out.println(s);
        else
            System.out.println("Invalid object");
    }

}
