import java.util.ArrayList;

public class Diamond extends Jewel {
    private int score = 0;


    @Override
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return "D";
    }


    @Override
    ArrayList<ArrayList<Jewel>> triples(int x, int y, Matrix matrix) {

        Space space = new Space();

        try {
            if (String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("D")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y-1, space);
                matrix.getLine().get(x - 2).set(y-2, space);
                setScore(90);
                Matrix.tempPoint = 90;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {

            if (String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("D")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y+1, space);
                matrix.getLine().get(x + 2).set(y+2, space);
                setScore(90);
                Matrix.tempPoint = 90;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if (String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("D")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y+1, space);
                matrix.getLine().get(x - 2).set(y+2, space);
                setScore(90);
                Matrix.tempPoint = 90;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if (String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y-2)).equals("D")) {
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y-1, space);
                matrix.getLine().get(x + 2).set(y-2, space);
                setScore(90);
                Matrix.tempPoint = 90;
                Matrix.Point += Matrix.tempPoint;
                return matrix.getLine();
            }
        }catch (Exception e){}

        return matrix.getLine();

    }



}
