package model;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piece{
    private Circle circle;
    public Piece(Color color){
        circle = new Circle(30);
        circle.setFill(color);
    }

    public Circle getCircle(){
        return circle;
    }
}