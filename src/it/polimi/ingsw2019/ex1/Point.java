package it.polimi.ingsw2019.ex1;

public class Point {

    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2)
                + Math.pow(this.y-p.y, 2));
    }


    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        System.out.println(p1.distance(p2));

    }
}
