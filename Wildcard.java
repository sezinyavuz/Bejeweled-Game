import java.util.ArrayList;

public class Wildcard extends Jewel{
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
        return "W";
    }

    @Override
    ArrayList<ArrayList<Jewel>> triples(int x, int y, Matrix matrix) {
        Space space = new Space();

        try {
            if ((String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("W") ||  String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("W"))&&
                    (!(matrix.getLine().get(x - 1).get(y) instanceof Symbols) &&  !(matrix.getLine().get(x - 2).get(y) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("D") ||  String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("T") ||  String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("S") ||  String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y, space);
                matrix.getLine().get(x - 2).set(y, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {

            if ((String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("W") ||  String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("W"))&&
                    (!(matrix.getLine().get(x + 1).get(y) instanceof Symbols) &&  !(matrix.getLine().get(x + 2).get(y) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("D") ||  String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("T") ||  String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("T"))){
                    setScore(35);
                    System.out.println();
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("S") ||  String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y, space);
                matrix.getLine().get(x + 2).set(y, space);
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if ((String.valueOf(matrix.getLine().get(x).get(y-1)).equals("W") ||  String.valueOf(matrix.getLine().get(x).get(y-2)).equals("W"))
                    && (!(matrix.getLine().get(x).get(y-1) instanceof Symbols) &&  !(matrix.getLine().get(x).get(y-2) instanceof Symbols))) {
                if ((String.valueOf(matrix.getLine().get(x).get(y-1)).equals("D") ||  String.valueOf(matrix.getLine().get(x).get(y-2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x).get(y-1)).equals("T") ||  String.valueOf(matrix.getLine().get(x).get(y-2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x).get(y-1)).equals("S") ||  String.valueOf(matrix.getLine().get(x).get(y-2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y-1, space);
                matrix.getLine().get(x).set(y-2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if ((String.valueOf(matrix.getLine().get(x).get(y+1)).equals("W") ||  String.valueOf(matrix.getLine().get(x).get(y+2)).equals("W"))
                    && (!(matrix.getLine().get(x).get(y+1) instanceof Symbols) &&  !(matrix.getLine().get(x).get(y+2) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x).get(y+1)).equals("D") ||  String.valueOf(matrix.getLine().get(x).get(y+2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x).get(y+1)).equals("T") ||  String.valueOf(matrix.getLine().get(x).get(y+2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x).get(y+1)).equals("S") ||  String.valueOf(matrix.getLine().get(x ).get(y+2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y+1, space);
                matrix.getLine().get(x).set(y+2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if ((String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("W") ||  String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("W"))
                    && (!(matrix.getLine().get(x - 1).get(y-1) instanceof Symbols) &&  !(matrix.getLine().get(x - 2).get(y-2) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("D") ||  String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("T") ||  String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("S") ||  String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y-1, space);
                matrix.getLine().get(x - 2).set(y-2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {

            if ((String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("W") ||  String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("W"))
                    && (!(matrix.getLine().get(x + 1).get(y + 1) instanceof Symbols) &&  !(matrix.getLine().get(x + 2).get(y +2) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("D") ||  String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("T") ||  String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("S") ||  String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y+1, space);
                matrix.getLine().get(x + 2).set(y+2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if ((String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("W") ||  String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("W"))
                    && (!(matrix.getLine().get(x - 1).get(y+1) instanceof Symbols) &&  !(matrix.getLine().get(x - 2).get(y+2) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("D") ||  String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("T") ||  String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("S") ||  String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y+1, space);
                matrix.getLine().get(x - 2).set(y+2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {

            if ((String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("W") ||  String.valueOf(matrix.getLine().get(x + 2).get(y-2)).equals("W"))
                    && (!(matrix.getLine().get(x + 1).get(y - 1) instanceof Symbols) &&  !(matrix.getLine().get(x + 2).get(y - 2) instanceof Symbols))) {

                if ((String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("D") ||  String.valueOf(matrix.getLine().get(x + 2).get(y-2)).equals("D"))){
                    setScore(50);
                    Matrix.tempPoint = 50;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("T") ||  String.valueOf(matrix.getLine().get(x + 2).get(y-2)).equals("T"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                if ((String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("S") ||  String.valueOf(matrix.getLine().get(x + 2).get(y-2)).equals("S"))){
                    setScore(35);
                    Matrix.tempPoint = 35;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y-1, space);
                matrix.getLine().get(x + 2).set(y-2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("D")||
                    String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("S") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("S")||
            String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("S") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y, space);
                matrix.getLine().get(x - 2).set(y, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("D")||
                    String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("S") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("S")||
                    String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("S") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y, space);
                matrix.getLine().get(x + 2).set(y, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("D")||
                    String.valueOf(matrix.getLine().get(x).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("S")||
                    String.valueOf(matrix.getLine().get(x).get(y-1)).equals("T") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x).get(y-1)).equals("T") && String.valueOf(matrix.getLine().get(x).get(y-2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y-1, space);
                matrix.getLine().get(x).set(y-2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("D")||
                    String.valueOf(matrix.getLine().get(x).get(y+1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("S")||
                    String.valueOf(matrix.getLine().get(x).get(y+1)).equals("T") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x ).get(y+2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x).get(y+1)).equals("S") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x).get(y+1)).equals("T") && String.valueOf(matrix.getLine().get(x).get(y+2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x).set(y+1, space);
                matrix.getLine().get(x).set(y+2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x-1).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x-2).get(y-2)).equals("D")||
                    String.valueOf(matrix.getLine().get(x-1).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x-2).get(y-2)).equals("S")||
                    String.valueOf(matrix.getLine().get(x-1).get(y-1)).equals("T") && String.valueOf(matrix.getLine().get(x-2).get(y-2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y-1)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x-1).set(y-1, space);
                matrix.getLine().get(x-2).set(y-2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x + 1).get(y + 1)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y + 2)).equals("D") ||
                    String.valueOf(matrix.getLine().get(x + 1).get(y + 1)).equals("S") && String.valueOf(matrix.getLine().get(x + 2).get(y + 2)).equals("S") ||
                    String.valueOf(matrix.getLine().get(x + 1).get(y + 1)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y + 2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x+1).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("S") && String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y+1)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y+2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y + 1, space);
                matrix.getLine().get(x + 2).set(y + 2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}
        try {
            if (String.valueOf(matrix.getLine().get(x - 1).get(y + 1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y + 2)).equals("D") ||
                    String.valueOf(matrix.getLine().get(x - 1).get(y + 1)).equals("S") && String.valueOf(matrix.getLine().get(x- 2).get(y + 2)).equals("S") ||
                    String.valueOf(matrix.getLine().get(x - 1).get(y + 1)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y + 2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("S") && String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x - 1).get(y+1)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y+2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x - 1).set(y + 1, space);
                matrix.getLine().get(x - 2).set(y + 2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}

        try {
            if (String.valueOf(matrix.getLine().get(x + 1).get(y - 1)).equals("D") && String.valueOf(matrix.getLine().get(x + 2).get(y - 2)).equals("D") ||
                    String.valueOf(matrix.getLine().get(x + 1).get(y - 1)).equals("S") && String.valueOf(matrix.getLine().get(x + 2).get(y - 2)).equals("S") ||
                    String.valueOf(matrix.getLine().get(x + 1).get(y - 1)).equals("T") && String.valueOf(matrix.getLine().get(x + 2).get(y - 2)).equals("T")) {

                if(String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("D") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("D")){
                    setScore(70);
                    Matrix.tempPoint = 70;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("S") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("S")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                if(String.valueOf(matrix.getLine().get(x + 1).get(y-1)).equals("T") && String.valueOf(matrix.getLine().get(x - 2).get(y-2)).equals("T")){
                    setScore(40);
                    Matrix.tempPoint = 40;
                    Matrix.Point += Matrix.tempPoint;
                }
                matrix.getLine().get(x).set(y, space);
                matrix.getLine().get(x + 1).set(y - 1, space);
                matrix.getLine().get(x + 2).set(y - 2, space);
                return matrix.getLine();
            }
        }catch (Exception e){}



        return matrix.getLine();
    }
}
