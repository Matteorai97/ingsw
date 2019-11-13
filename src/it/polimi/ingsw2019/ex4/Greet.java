package it.polimi.ingsw2019.ex4;

import java.util.function.Consumer;

public class Greet {

    public static Consumer<String> make(String greet){
        return (String name) -> {
            System.out.println(greet + " " + name);
        };
    }

    public static void main(String[] args){
        Consumer<String> hello = make("hello");
        hello.accept("Giovanni");
        hello.accept("Mary");

        Consumer<String> ciao = make("Ciao");
        ciao.accept("Giovanni");
        ciao.accept("Mary");
    }
}

