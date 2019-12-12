package it.polimi.ingsw2019.ex7;

public class LengthSorter implements Sorter<String> {

    @Override
    public boolean lessThan(String o1, String o2) {
        return o1.length() < o2.length();
    }
}
