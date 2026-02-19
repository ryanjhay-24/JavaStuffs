package TestingGrounds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static ArrayList<Integer> union(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (Integer x : setA) {
            if (x != null && seen.add(x)) {
                result.add(x);
            }
        }
        for (Integer x : setB) {
            if (x != null && seen.add(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
