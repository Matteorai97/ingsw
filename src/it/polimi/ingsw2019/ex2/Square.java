package it.polimi.ingsw2019.ex2;

public class Square extends Polygon {

    private float edge;

    public Square(float edge){
        this.edge = edge;
    }

    @Override
    public float getPerimeter() {
        return edge*4;
    }

    @Override
    public String getName() {
        return "Quadrato";
    }
}
