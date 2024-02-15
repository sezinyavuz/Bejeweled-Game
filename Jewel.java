import java.util.ArrayList;

abstract class Jewel {


    public abstract int getScore();

    abstract ArrayList<ArrayList<Jewel>> triples(int x , int y , Matrix matrix);

}
