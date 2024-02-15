import java.util.ArrayList;

public class Slash extends Symbols {
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
        return "/";
    }

    @Override
    ArrayList<ArrayList<Jewel>> triples(int x, int y, Matrix matrix) {
        Space space = new Space();
        try {
            if (matrix.getLine().get(x - 1).get(y+1) instanceof Symbols && (matrix.getLine().get(x - 2).get(y+2) instanceof Symbols)) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y+1, space);
                matrix.getLine().get(x - 2).set(y+2, space);
                setScore(60);
                Matrix.tempPoint = 60;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {
            if (matrix.getLine().get(x + 1).get(y -1) instanceof Symbols && (matrix.getLine().get(x + 2).get(y-2) instanceof Symbols)) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y-1, space);
                matrix.getLine().get(x + 2).set(y-2, space);
                setScore(60);
                Matrix.tempPoint = 60;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        return matrix.getLine();
    }
}
