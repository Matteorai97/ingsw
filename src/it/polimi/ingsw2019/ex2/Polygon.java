package it.polimi.ingsw2019.ex2;

import java.util.ArrayList;
import java.util.List;

abstract public class Polygon {

   public abstract float getPerimeter();
   public abstract String getName();

   public static void printPolygon(Polygon p){
       System.out.println("Il perimetro del "
               +p.getName()+" è "+p.getPerimeter());
   }

   public static void printPolygons(List<Polygon> ps){
       for(Polygon p : ps)
           printPolygon(p);
   }


   public static void main(String[] args){
       Square s = new Square(5);
       Triangle t = new Triangle(1, 1, 1);

       List<Polygon> l = new ArrayList<Polygon>();
       l.add(s);
       l.add(t);

       printPolygons(l);

   }

}
