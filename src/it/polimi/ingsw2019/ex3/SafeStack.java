package it.polimi.ingsw2019.ex3;

import it.polimi.ingsw2019.ex1.Stack;

public class SafeStack extends Stack {

    public SafeStack(int max){
        super(max);
    }

    public int safePop() throws OutOfDataException {
        if (cur > 0){
            return super.pop();
        }
        else throw new OutOfDataException();
    }

    public void safePush(int i) {
        if (cur == data.length)
            throw new OutOfSpaceException();
        else
            super.push(i);
    }

    public static void main(String[] args)  {
        SafeStack s = new SafeStack(1);

        s.safePush(10);
        s.safePush(8);



    }

}
