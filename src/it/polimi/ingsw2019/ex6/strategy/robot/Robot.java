package it.polimi.ingsw2019.ex6.strategy.robot;

public class Robot {
    MovementBehavior behavior;

    public Robot(){
        behavior = new DefensiveBehavior();
    }

    public void move(){
        int i = behavior.numSteps();
        System.out.println("Moving of "+i+" steps");
        System.out.println(behavior.say());
    }

    public void setBehavior(MovementBehavior behavior) {
        this.behavior = behavior;
    }


    public static void main(String[] args){
        Robot r = new Robot();
        r.move();
        r.setBehavior(new AggressiveBehavior());
        r.move();
        r.setBehavior(new DefensiveBehavior());
        r.move();
    }
}
