package it.polimi.ingsw2019.ex4;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunArrayList<T> extends ArrayList<T> {

    public <E> ArrayList<E> map(Function<T, E> f){
        ArrayList<E> res = new ArrayList<>();

        for (T elem : this){
            res.add(f.apply(elem));
        }

        return res;
    }

    public ArrayList<T> filter(Predicate<T> f){
        ArrayList<T> res = new ArrayList<>();

        for (T elem : this){
            if(f.test(elem))
                res.add(elem);
        }

        return res;
    }


    private ArrayList<T> takewhileAux(
            Predicate<T> f, int i, ArrayList<T> res){

        if(i == this.size() || !f.test(this.get(i))){
            return res;
        }

        res.add(this.get(i));
        return takewhileAux(f, i+1, res);
    }

    public ArrayList<T> takewhile(Predicate<T> f){
        return takewhileAux(f, 0, new ArrayList<>());
    }


    /*
    public ArrayList<T> takewhile(Predicate<T> f){
        ArrayList<T> res = new ArrayList<>();

        for (T elem : this){
            if(f.test(elem))
                res.add(elem);
            else break;
        }

        return res;
    }
    */

    public <R> R reduce(BiFunction<R, T, R> f, R initial){
        R res = initial;

        for (T elem : this){
            res = f.apply(res, elem);
        }

        return res;
    }

    public static void main(String[] args){
        var a = new FunArrayList<String>();
        a.add("ABC");
        a.add("D");
        a.add("EFGH");

        var r = a.map((s) -> s.length());
        System.out.println(r);
        var r2 = a.filter((s) -> s.charAt(0) > 'C');
        System.out.println(r2);
        var r3 = a.reduce((e, i) -> e+i.length(), 5);
        System.out.println(r3);

        var r4 = a.takewhile((s) -> s.length() > 5);
        System.out.println(r4);

    }
}
