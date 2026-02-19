package FinalsActCC103;
import java.util.BitSet;
//import java.util.Scanner;
public class Act3 {
//initialization of subjects in bitset
static final int CC101 = 0;
static final int CC102 = 1;
static final int CC103 = 2;
static final int CC104 = 3;
static final int CC105 = 4;
//constant passing score
static final int Passing = 75;
//checks if the student passed all the subjects
public static boolean didPassAll(BitSet stud) {
      return stud.cardinality() == 5;
      }
public static void main(String[] args) {
      //creating an object for student
      BitSet stud1 = new BitSet(5);
      BitSet stud2 = new BitSet(5);
      BitSet stud3 = new BitSet(5);
      //student's scores
      int[] stud1sc = {85,90,75,80,95};
      int[] stud2sc = {70,88,60,85,92};
      int[] stud3sc = {90,80,85,70,95};
      //this is where the data from setPassFail function will be stored
      setPassFail(stud1,stud1sc);
      setPassFail(stud2,stud2sc);
      setPassFail(stud3,stud3sc);
      //getResult will display the results for the corresponding students
      System.out.println("Student's 1 Results: "+getResult(stud1,stud1sc));
      System.out.println("Student's 2 Results: "+getResult(stud2,stud2sc));
      System.out.println("Student's 3 Results: "+getResult(stud3,stud3sc));
      //output from the function "setPassFail"
      System.out.println("Did Student 1 pass all subject? " +didPassAll(stud1));
      System.out.println("Did Student 2 pass all subject? " +didPassAll(stud2));
      System.out.println("Did Student 3 pass all subject? " +didPassAll(stud3));
      }
//determines wether the student passes or fails
public static void setPassFail(BitSet stud, int[] sc) {

for (int i = 0; i <sc.length; i++){
      if (sc[i] >=  Passing){
            stud.set(i);
      }else{
            stud.clear(i);
      }
}
}
//get result function
public static String getResult (BitSet stud, int[] scores) {
StringBuilder result = new StringBuilder();
if (stud.get(CC101))
       result.append("CC101: Passed(").append(scores[CC101]).append("). ");
 else
       result.append("CC101: Failed(").append(scores[CC101]).append("). ");

if (stud.get(CC102))
       result.append("CC102: Passed(").append(scores[CC102]).append("). ");
 else
       result.append("CC102: Failed(").append(scores[CC102]).append("). ");

if (stud.get(CC103))
       result.append("CC103: Passed(").append(scores[CC103]).append("). ");
 else
       result.append("CC103: Failed(").append(scores[CC103]).append("). ");

if (stud.get(CC104))
       result.append("CC104: Passed(").append(scores[CC104]).append("). ");
 else
       result.append("CC104: Failed(").append(scores[CC104]).append("). ");

if (stud.get(CC105))
       result.append("CC105: Passed(").append(scores[CC105]).append("). ");
 else
       result.append("CC105: Failed(").append(scores[CC105]).append("). ");

   return result.toString();
      }

}