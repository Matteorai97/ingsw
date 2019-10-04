package it.polimi.ingsw2019.ex1;

public class Polygon {

    private Point[] vertices;

    public Polygon(int numVertices){
        vertices = new Point[numVertices];
    }

    public Polygon(Point[] points){
        vertices = points;
    }

    public void setVertex(int n, float x, float y){
        vertices[n] = new Point(x, y);
    }

    public void setVertex(int n, Point p){
        vertices[n] = p;
    }

    public float getPerimeter(){

        float p = 0;

        for (int i = 0; i < vertices.length; i++){
            p += vertices[i].distance(vertices[(i+1) % vertices.length]);
        }

        return p;
    }

    public static void main(String[] args){
        Polygon square = new Polygon(4);
        square.setVertex(0, new Point(0, 0));
        square.setVertex(1, new Point(0, 1));
        square.setVertex(2, 1, 1);
        square.setVertex(3, 1, 0);
        System.out.println("Il perimetro è " + square.getPerimeter());

    }
}
