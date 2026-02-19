package FinalsActCC103;
import java.util.Vector;
import java.util.ArrayList;

public class Act2 {

    enum Month{
        January,
        February,aasdasdq wdasdawd
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December,
    }


public static void main(String[] args) {

    ArrayList<String> subs = new ArrayList<>();
        subs.add("Programming");
        subs.add("Database");
        subs.add("Networking");
        subs.add("Algorithm");
        subs.add("Datastructure");

    Vector<Integer> Scores = new Vector<>();

        Scores.add(85);
        Scores.add(90);
        Scores.add(88);
        Scores.add(92);
        Scores.add(80);
        Scores.add(95);
        Scores.add(97);
        Scores.add(85);
        Scores.add(80);
        Scores.add(86);

    int sum = 0;
        for (int sc: Scores) {
        sum += sc;
        }
    double avg = (double) sum/Scores.size();


System.out.println("-----------Months-----------");
    for(Month month: Month.values()) {
        System.out.println(month);
    }

System.out.println("-----------Subjects-----------");
    for (String sub: subs) {
        System.out.println(sub);
    }

System.out.println("-----------Scores-----------");
    for (int sc: Scores) {
        System.out.println(sc);
    }
    
System.out.print("Average Scores "+avg);


    }
}
