package TestingGrounds;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;



public class Universal {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> firstSet = new ArrayList<Integer>();
        ArrayList<Integer> SecondSet = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        //UNIVERSAL CONSTRUCTOR
        System.out.print("Enter the size of union: ");
        int size = sc.nextInt();
        
            for (int i = 0; i < size; i++){
                nums.add(rand.nextInt(10));
            }
        Collections.shuffle(nums);
        System.out.println(nums);
        //1ST SET
        System.out.print("Enter the name of the First set: ");
        String name = sc.next();
            for (int j = 0; j < 3; j++){
                System.out.print("Enter up to 3: ");
                int Set1 = sc.nextInt();
                firstSet.add(Set1);
            }
        System.out.printf("Your first set is: \n%s", name + firstSet);
        System.out.println();
        //2ND SET
        System.out.print("Enter the name of the 2nd Set: ");
        String name2 = sc.next();
        for (int j = 0; j < 3; j++){
            System.out.print("Enter up to 3: ");
            int Set2 = sc.nextInt();
            SecondSet.add(Set2);
        }
        System.out.printf("Your Second set is: \n%s", name2 + SecondSet);
        System.out.println("\n\n");
        //RESULTS
        System.out.println("----------RESULT----------");
        System.out.println(name + firstSet);
        System.out.println(name2 + SecondSet);

        ArrayList<Integer> unionResult = Union.union(firstSet, SecondSet);
        System.out.println("Union: " + unionResult);
        ArrayList<Integer> intersectionResult = Intersection.intersection(firstSet, SecondSet);
        System.out.println("Intersection: "+ intersectionResult);
        System.out.print("--------------------------");
        

        sc.close();


        
    }
    


    
}
