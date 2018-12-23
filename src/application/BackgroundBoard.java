package application;

import application.fields.BackgroundField;
import application.fields.BoardField;
import javafx.scene.paint.Color;

import java.util.LinkedList;
import java.util.List;

public class BackgroundBoard extends Board {

    @Override
    public int getBoardX() {
        return boardX;
    }

    @Override
    public void setBoardX(int boardX) {
        this.boardX = boardX;
    }

    public int getBoardY() {
        return boardY;
    }

    public void setBoardY(int boardY) {
        this.boardY = boardY;
    }

    @Override
    public List<BoardField> getBackgroundFields() {
        return backgroundFields;
    }

    public void setBackgroundFields(List<BoardField> backgroundFields) {
        this.backgroundFields = backgroundFields;
    }

    public int boardX = 9;
    public int boardY = 9;

    private List<BoardField> backgroundFields = new LinkedList<>();

    public void generateBackgroundFields() {
        for (int x = 0; x < boardX; x++) {
            for (int y = 0; y < boardY; y++) {
                BoardField bf = new BackgroundField(x, y);
                backgroundFields.add(bf);
            }
        }
        generateBgStartField();
        generateBgFinishField();
        System.out.println(backgroundFields.size());
    }
    public void generateBgStartField() {
        BoardField bgStartField = new BackgroundField(0,0);
        bgStartField.getShapeX().setFill(Color.GREEN);
        backgroundFields.add(0, bgStartField);
    }
    public void generateBgFinishField() {
        BoardField BfFinishField = new BackgroundField(8,8);
        BfFinishField.getShapeX().setFill(Color.RED);
        backgroundFields.add(82, BfFinishField);
    }
//    public void generateBgSpecialField() {
//        BoardField bfStartField = new BackgroundField(0,0);
//        bfStartField.getShapeX().setFill(Color.GREEN);
//        backgroundFields.add(0, bfStartField);
//    }
}
