package it.polimi.ingsw2019.ex7;

import it.polimi.ingsw2019.ex4.GenericStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrdStack<E> extends GenericStack<E> {

    private Sorter<E> sorter;

    public OrdStack(int max, Sorter<E> sorter) {
        super(max);
        this.sorter = sorter;
    }

    public void setSorter(Sorter<E> sorter) {
        this.sorter = sorter;
    }

    @Override
    public Iterator<E> iterator() {
        return new OrderedIterator();
    }

    private class OrderedIterator implements Iterator<E> {

        int cur = 0;
        List<E> itData;

        public OrderedIterator(){
            itData = new ArrayList<>(data);
            bubbleSort();
        }

        private void bubbleSort(){
            for(int i = 0; i < itData.size(); i++){
                boolean flag = false;
                for (int j = 0; j < itData.size() - 1; j++ ){
                    E o1 = itData.get(j + 1);
                    E o2 = itData.get(j);
                    if (sorter.lessThan(o1, o2)){
                        itData.set(j, o1);
                        itData.set(j + 1, o2);
                        flag = true;
                    }

                }
                if (!flag) break;
            }
        }

        @Override
        public boolean hasNext() {
            return cur < itData.size();
        }

        @Override
        public E next() {
            return itData.get(cur++);
        }
    }

    public static void main(String[] args){
        Sorter<String> lenSorter = new Sorter<String>(){

            @Override
            public boolean lessThan(String o1, String o2) {
                return o1.length() < o2.length();
            }
        };

        OrdStack<String> stack = new OrdStack<>(10, lenSorter);
        stack.push("aaa");
        stack.push("bb");
        stack.push("cccc");

        for (String s : stack){
            System.out.println(s);
        }
    }

}
