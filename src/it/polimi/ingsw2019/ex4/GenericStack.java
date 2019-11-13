package it.polimi.ingsw2019.ex4;

import it.polimi.ingsw2019.ex3.OutOfDataException;
import it.polimi.ingsw2019.ex3.OutOfSpaceException;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericStack<E> implements Iterable<E> {

    LinkedList<E> data = new LinkedList<>();
    private int limit;

    public GenericStack(int max){
        limit = max;
    }

    public void push(E elem){
        if (data.size() == limit)
            throw new OutOfSpaceException();
        data.addFirst(elem);
    }

    public E pop(){
        if (data.size()==0)
            throw new OutOfDataException();

        return data.removeFirst();
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }

    public boolean isFull(){
        return data.size() == limit;
    }

    @Override
    public Iterator<E> iterator() {
        return new GenericStackIterator<>(this);
    }

    private class StackIterator implements Iterator<E>{

        private int cur = 0;

        @Override
        public boolean hasNext() {
            return cur < data.size();
        }

        @Override
        public E next() {
            return data.get(cur++);
        }
    }

    public static void main(String[] args){
        GenericStack<String> s = new GenericStack<>(10);
        s.push("a");
        s.push("b");
        System.out.println(s.pop());
        System.out.println(s.pop());

        GenericStack<Integer> s1 = new GenericStack<>(10);
        s1.push(5);
        s1.push(6);
        s1.push(-1);

        var it = s1.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }


}


