import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args)  throws IOException {

        Matrix matrix = new Matrix();
        matrix.board(new File(args[0]));
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<String[]> commandlist = new ArrayList<>();


        String leaderboard = "leaderboard.txt";
        File file2 = new File(leaderboard);
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner1.hasNext()) {
            String[] line = scanner1.nextLine().split(" ");
            Person person = new Person(line[0], Integer.valueOf(line[1]));
            personList.add(person);
        }

        FileWriter out = new FileWriter("monitoring.txt");
        String commandfile = args[1];
        File file1 = new File(commandfile);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        out.write("Game grid:\n\n");
        out.write(String.valueOf(matrix.printMatrix()));
        out.write("\n");

        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            commandlist.add(line);


            if (line[0].equals("E")){
                out.write("\nSelect coordinate or enter E to end the game: E\n\n");

            }
           try {
               out.write("\nSelect coordinate or enter E to end the game: " + line[0] + " " + line[1] +"\n\n");
               matrix.getLine().get(Integer.parseInt(line[0])).get(Integer.parseInt(line[1])).triples(Integer.parseInt(line[0]), Integer.parseInt(line[1]), matrix);
               matrix.scroll(matrix.getLine());
               out.write(String.valueOf(matrix.printMatrix()));
               out.write("\n");
               out.write("Score: "+ Matrix.tempPoint + " points");
               out.write("\n");


           }catch (Exception e){}
        }

        Person person1 = new Person(commandlist.get(commandlist.size()-1)[0],Matrix.Point);
        personList.add(person1);
        Collections.sort(personList, Person::compareTo);
        Collections.reverse(personList);

        out.write("Total score: "+Matrix.Point+" \n\n");
        out.write("Enter name: " + person1.getName() + "\n\n");

        if(person1.equals(personList.get(0))){
            out.write("Your ranks is 1/" + personList.size() + ", your score is " + (personList.get(0).getScore()-personList.get(1).getScore()) +
                    " points higher than " + personList.get(1).getName());
        }
        else if (person1.equals(personList.get(personList.size()-1))){
            out.write("Your ranks is " + (personList.size()-1) +"/" + personList.size() + ", your score is " + (personList.get(personList.size()-2).getScore()-personList.get(personList.size()-1).getScore()) +
                    " points lower than " + personList.get(personList.size()-2).getName());
        }
        else{
            out.write("Your ranks is "+ (personList.indexOf(person1)+1)+"/" + personList.size() + ", your score is " + (personList.get(personList.indexOf(person1)-1).getScore()-personList.get(personList.indexOf(person1)).getScore()) +
                    " points lower than " + personList.get(personList.indexOf(person1)-1).getName() +
                    " and " + (personList.get(personList.indexOf(person1)).getScore()-personList.get(personList.indexOf(person1)+1).getScore()) + " higher than" + personList.get(personList.indexOf(person1)+1).getName() );
        }
        out.write("\n\nGood bye!");
        out.close();

        FileWriter out1 = new FileWriter("leaderboard.txt", true);
        out1.write("\n");
        out1.write(person1.getName() +" "+ Matrix.Point);
        out1.close();

    }
}
