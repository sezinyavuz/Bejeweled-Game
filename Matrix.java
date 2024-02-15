import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    private ArrayList <ArrayList<Jewel>> line = new ArrayList<>();
    public static Integer tempPoint = 0;
    public static Integer Point = 0;

    public ArrayList<ArrayList<Jewel>> getLine() {
        return line;
    }

    public ArrayList<ArrayList<Jewel>> board(File file){


        File file1 = new File(String.valueOf(file));
        Scanner scan = null;
        try {
            scan = new Scanner(file1);
            while (scan.hasNextLine()) {
                String[] column = scan.nextLine().split(" ");
                ArrayList<Jewel> columnjewel = new ArrayList<>();
                for(String i : column){
                    if( i.equals("D")){
                        Jewel diamonds = new Diamond();
                        columnjewel.add(diamonds);
                    }
                    if( i.equals("S")){
                        Jewel square = new Square();
                        columnjewel.add(square);
                    }
                    if( i.equals("T")){
                        Jewel triangle = new Triangle();
                        columnjewel.add(triangle);
                    }
                    if( i.equals("W")){
                        Jewel wildCard = new Wildcard();
                        columnjewel.add(wildCard);
                    }
                    if( i.equals("/")){
                        Jewel symbol = new Slash();
                        columnjewel.add(symbol);
                    }
                    if( i.equals("+")){
                        Jewel symbol = new Plus();
                        columnjewel.add(symbol);
                    }
                    if( i.equals("-")){
                        Jewel symbol = new Minus();
                        columnjewel.add(symbol);
                    }
                    if( i.equals("\\")){
                        Jewel symbol = new BackSlash();
                        columnjewel.add(symbol);
                    }
                    if( i.equals("|")){
                        Jewel symbol = new Stick();
                        columnjewel.add(symbol);
                    }
                }
                this.line.add(columnjewel);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return line;
    }
    @Override
    public String toString(){
        return String.valueOf(this.line);
    }



    public StringBuilder printMatrix() {

        StringBuilder sb = new StringBuilder();

        try {
            for (ArrayList<Jewel> i : this.line) {

                sb.append(i.toString().replace(",", "").replace("[", "").replace("]", ""));
                sb.append("\n");
            }
        } catch (Exception e) {
        }
        return sb;
    }


    public ArrayList<ArrayList<Jewel>> scroll(ArrayList<ArrayList<Jewel>> list){

        list = this.line;
        Space space = new Space();

        for(int r = 0 ; r < list.size(); r++){

            try {
                for (int a = 0; a < list.size() - 1; a++) {

                    for (int b = 0; b < list.get(0).size(); b++) {
                        if (list.get(a + 1).get(b) instanceof Space) {
                            Jewel jewel = list.get(a).get(b);
                            list.get(a).set(b, space);
                            list.get(a+1).set(b, jewel);
                        }
                    }

                }
            }catch (Exception e){}
        }
        return list;
    }
}
