package it.polimi.ingsw2019.ex1;

public class Set {

    private int numbers[];
    private int curSize;

    public Set(int size){
        curSize = 0;
        numbers = new int[size];
    }

    public Set(){
        this(100);
    }

    public boolean isMember(int n){
        int i = 0;
        while (i < curSize){
            if (numbers[i] == n)
                return true;
            i++;
        }
        return false;
    }

    public void addMember(int n){
        if (isMember(n) || curSize == numbers.length)
            return;

        numbers[curSize] = n;
        curSize++;
    }

    public void deleteMember(int n){
        int i = 0;
        while (i < curSize){
            if(numbers[i] == n){
                curSize--;
                while(i < curSize){
                    numbers[i] = numbers[i+1];
                    i++;
                }
                return;
            }
            i++;
        }
    }

    public void showSet(){
        int i = 0;
        boolean first = true;
        String res = "{";

        while (i < curSize){
            if (first)
                first = false;
            else
                res += " , ";

            res +=numbers[i];
            i++;
        }

        res += "}";

        System.out.println(res);
    }


    public static void main(String[] args){
        Set s = new Set(5);

        s.addMember(0);
        s.addMember(19);
        s.addMember(14);
        s.addMember(-5);
        s.addMember(8);

        s.deleteMember(14);
        s.addMember(0);

        s.showSet();
    }


}
