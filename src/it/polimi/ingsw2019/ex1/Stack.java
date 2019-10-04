package it.polimi.ingsw2019.ex1;

public class Stack {

    private int data[];
    private int cur;
    private int size;

    public Stack(int size){
        this.size = size;
        data = new int[size];
        cur = 0;
    }

    public Stack(){
        this(10);
    }

    public void push(int n){
        if (cur < size){
            data[cur] = n;
            cur++;
        }
    }

    public int pop(){
        if (cur > 0){
            cur--;
            return data[cur];
        }

        return Integer.MIN_VALUE;
    }

    public int size(){
        return cur;
    }

    public static void main(String[] args){
        Stack s = new Stack(5);

        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
