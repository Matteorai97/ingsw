package it.polimi.ingsw2019.ex6.decorator;

public abstract class Responsability implements Employee {

    private Employee decorated;
    private String office;

    public Responsability(Employee decorated, String office){
        this.decorated = decorated;
        this.office = office;
    }

    @Override
    public String getName() {
        return decorated.getName();
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public String getDescription() {
        return decorated.getDescription() +  ", "+getResponsabilityDescription() + " - area: "+office;
    }

    abstract protected String getResponsabilityDescription();
}
