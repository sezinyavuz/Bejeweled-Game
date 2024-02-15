import java.util.ArrayList;

public class Stick extends Symbols{
    private int score=0;

    @Override
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return "|";
    }

    @Override
    ArrayList<ArrayList<Jewel>> triples(int x, int y, Matrix matrix) {
        Space space = new Space();
        try {
            if (matrix.getLine().get(x-1).get(y) instanceof Symbols && (matrix.getLine().get(x-2).get(y) instanceof Symbols)) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x-1).set(y, space);
                matrix.getLine().get(x-2).set(y, space);
                setScore(60);
                Matrix.tempPoint = 45;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {
            if (matrix.getLine().get(x+1).get(y) instanceof Symbols && (matrix.getLine().get(x+2).get(y) instanceof Symbols)) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x+1).set(y, space);
                matrix.getLine().get(x+2).set(y, space);
                setScore(60);
                return matrix.getLine();
            }
        }catch (Exception e){}

        return matrix.getLine();
    }
}
