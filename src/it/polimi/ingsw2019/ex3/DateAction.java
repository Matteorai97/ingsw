package it.polimi.ingsw2019.ex3;

import java.util.Date;

public class DateAction {

    private Date when;
    private Actionable what;

    public DateAction(Date when, Actionable what){
        this.when = when;
        this.what = what;
    }

    public Date getWhen() {
        return when;
    }

    public Actionable getWhat() {
        return what;
    }

}
