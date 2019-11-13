package it.polimi.ingsw2019.ex4;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int num1;
    private int num2;
    private int pos;

    public FibonacciIterator(){
        num1 = 1;
        num2 = 1;
        pos = 0;
    }


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if(pos == 0 || pos ==1){
            pos++;
            return 1;
        }
        pos++;
        int t = num1+num2;
        num1 = num2;
        num2=t;
        return  t;
    }

    public static void main(String[] args){
        FibonacciIterator f = new FibonacciIterator();
        System.out.println(f.next());
        System.out.println(f.next());
        System.out.println(f.next());
        System.out.println(f.next());
        System.out.println(f.next());
    }
}
