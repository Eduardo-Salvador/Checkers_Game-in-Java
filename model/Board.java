package model;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Board extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Rectangle r = new Rectangle(75,75);
                r.setFill((i + j) % 2 == 0 ? Color.BURLYWOOD : Color.BROWN);
                grid.add(r, j, i);
                if (i < 3 && (i + j) % 2 != 0) { 
                    Piece black = new Piece(Color.BLACK);
                    grid.add(black.getCircle(), j, i);
                    GridPane.setHalignment(black.getCircle(), javafx.geometry.HPos.CENTER);
                    GridPane.setValignment(black.getCircle(), javafx.geometry.VPos.CENTER);

                }
                if (i > 4 && (i + j) % 2 != 0) { 
                    Piece blue = new Piece(Color.DARKBLUE);
                    grid.add(blue.getCircle(), j, i);
                    GridPane.setHalignment(blue.getCircle(), javafx.geometry.HPos.CENTER);
                    GridPane.setValignment(blue.getCircle(), javafx.geometry.VPos.CENTER);

                }
            }
        }
        Scene scene = new Scene(grid, 600, 600);
        stage.setTitle("Checker Game"); 
        stage.setScene(scene);   
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}