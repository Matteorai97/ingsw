package it.polimi.ingsw2019.ex6.strategy.robot;

public class DefensiveBehavior implements MovementBehavior {

    @Override
    public int numSteps() {
        return 0;
    }

    @Override
    public String say() {
        return "No movement...";
    }


}
