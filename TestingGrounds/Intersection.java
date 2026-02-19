package TestingGrounds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static ArrayList<Integer> intersection(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        Set<Integer> inA = new HashSet<>(setA);
        Set<Integer> added = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer x : setB) {
            if (x != null && inA.contains(x) && added.add(x)) {
                result.add(x);
            }else{
                System.err.println();
            }
        }
        return result;
    }
}
