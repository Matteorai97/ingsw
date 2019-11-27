package it.polimi.ingsw2019.ex6.strategy.robot;

public class AggressiveBehavior implements MovementBehavior {
    @Override
    public int numSteps() {
        return 5;
    }

    @Override
    public String say() {
        return "Moving fast...";
    }
}
