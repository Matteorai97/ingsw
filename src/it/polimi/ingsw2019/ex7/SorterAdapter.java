package it.polimi.ingsw2019.ex7;

import java.util.ArrayList;
import java.util.Comparator;

public class SorterAdapter<E> implements Comparator<E> {

    private Sorter<E> sorter;

    public SorterAdapter(Sorter<E> sorter){
        this.sorter = sorter;
    }

    @Override
    public int compare(E o1, E o2) {
        if (o1.equals(o2))
            return 0;
        return sorter.lessThan(o1, o2) ? -1 : 1;
    }

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        a.add("cccc");
        a.add("aa");
        a.add("bbb");

        a.sort(new SorterAdapter<>(new LengthSorter()));

        for (String s : a){
            System.out.println(s);
        }
    }
}
