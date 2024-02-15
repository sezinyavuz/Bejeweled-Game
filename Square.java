import java.util.ArrayList;

public class Square extends Jewel{
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
        return "S";
    }

    @Override
    ArrayList<ArrayList<Jewel>> triples(int x, int y, Matrix matrix) {
        Space space = new Space();

        try {
            if (String.valueOf(matrix.getLine().get(x).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("S")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y-1, space);
                matrix.getLine().get(x).set(y-2, space);
                setScore(45);
                Matrix.tempPoint = 45;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {

            if (String.valueOf(matrix.getLine().get(x).get(y+1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("S")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y+1, space);
                matrix.getLine().get(x).set(y+2, space);
                setScore(45);
                Matrix.tempPoint = 45;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        return matrix.getLine();
    }


}
