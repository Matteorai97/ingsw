package it.polimi.ingsw2019.ex2;

public class Grade {

    private int points;
    private int credits;

    public Grade(int points, int credits){
        this.points = points;
        this.credits = credits;
    }

    public int getPoints() {
        return points;
    }

    public int getCredits() {
        return credits;
    }
}
