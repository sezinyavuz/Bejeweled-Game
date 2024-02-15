import java.util.ArrayList;

public class Triangle extends Jewel{
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
        return "T";
    }

    @Override
    ArrayList<ArrayList<Jewel>> triples(int x , int y , Matrix matrix) {
        Space space = new Space();

        try {
            if (String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("T")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y, space);
                matrix.getLine().get(x - 2).set(y, space);
                setScore(45);
                Matrix.tempPoint = 45;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {

            if (String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("T")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y, space);
                matrix.getLine().get(x + 2).set(y, space);
                setScore(45);
                Matrix.tempPoint = 45;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        return matrix.getLine();

    }
}
