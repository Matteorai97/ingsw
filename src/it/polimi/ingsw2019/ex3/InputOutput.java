package it.polimi.ingsw2019.ex3;

import java.util.Scanner;

public class InputOutput {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il numero di ripetizioni:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Inserire una frase: ");
            String st = scanner.nextLine();
            System.out.println("Inserire una sottostringa da cercare: ");
            String sub = scanner.nextLine();

            int res = count(st, sub);

            System.out.println("Il numero di occorrenze è: " + res);
        }
    }

    public static int count(String s, String sub){
        int sum = 0, i = 0, x = 0;

        do {
            x = s.indexOf(sub, i);
            if (x != -1)
                sum++;
            i = x + 1;

        } while (x != -1);

        return sum;
    }
}
