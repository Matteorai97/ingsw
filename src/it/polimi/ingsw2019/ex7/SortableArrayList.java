package it.polimi.ingsw2019.ex7;

import java.util.ArrayList;

public class SortableArrayList<E> extends ArrayList<E> {

    public void sort(Sorter<E> sorter){
        this.sort(new SorterAdapter<>(sorter));
    }
}
