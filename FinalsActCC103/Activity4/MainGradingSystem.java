package FinalsActCC103.Activity4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MainGradingSystem {
    //ACTIVATING HASMAP STORING STRINGS AND INTEGERS WITH THE OBJECT NAME "studGrades"
    private static Map<String, Integer> studGrades = new HashMap<>();

    //MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("--------Grading Systtem--------");
            System.out.println("1. Add a Grade to a Student");
            System.out.println("2. View all the Students and their grades");
            System.out.println("3. Update student's grade");
            System.out.println("4. Remove a student");
            System.out.println("5. View all the average grades");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    addStud(sc);
                    break;
                case 2:
                    viewGrades(sc);
                    break;
                case 3:
                    updGrade(sc);
                    break;
                case 4:
                    removeStud(sc);
                    break;
                case 5:
                    viewAvgAll(sc);
                    break;
                case 6:
                    System.out.println("Closing the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }while (choice != 6);
        sc.close();

    }
    // METHOD FOR ADDING A STUDENT
    private static void addStud(Scanner sc) {
        System.out.println("Enter the student's name: ");
        String stud = sc.next();
        System.out.println("Enter " + stud + "'s grade: ");
        int grade = sc.nextInt();
        if (grade >= 100 || grade <=0){
            System.out.println("invalid grade. Please set it within 0-100 percentile");
        }else{
            studGrades.put(stud, grade);
            System.out.println("Student "+ stud +" added with grade " + grade);
        }
    }
    // METHOD FOR VIEWING ALL THE STUDENTS AND THEIR GRADES
    private static void viewGrades(Scanner sc){
        if (studGrades.isEmpty()){
            System.out.println("No students found");
        }else{
            System.out.println("\n -----All students and their grades-----");
            for (Map.Entry<String, Integer> entry : studGrades.entrySet()){
                System.out.println("Student: " + entry.getKey() +", Grade: " + entry.getValue());
            }
        }
    }
    //  METHOD FOR UPDATING THE GRADE OF A STUDENT
    private static void updGrade(Scanner sc){
        System.out.print("Enter the students name to update their grade: ");
        String stud = sc.next();

        if (studGrades.containsKey(stud)){
            System.out.println("Enter new grade for "+ stud +":");
            int newGrd = sc.nextInt();
            studGrades.put(stud, newGrd);
            System.out.println("Grade for "+ stud +" updated to "+ newGrd);
        }else{
            System.out.println("Student not found");
        }
    }
    //METHOD FOR REMOVING A STUDENT
    private static void removeStud(Scanner sc){
        System.out.print("Enter the name of the student to remove: ");
        String stud = sc.next();

        if (studGrades.containsKey(stud)){
            studGrades.remove(stud);
            System.out.println("Student has been removed");
        }else{
            System.out.println("Student not found...");
        }
    }

    private static void viewAvgAll(Scanner sc){
        System.out.println("\n -----All student's average grade-----");
        for (Map.Entry<String, Integer> entry : studGrades.entrySet()){
        System.out.println("Name: "+entry.getKey()+" Grade: "+entry.getValue());
        }
        double sum = 0;
        for (Integer grade : studGrades.values()){
            sum += grade;
        }
        double average = 0;
        if (!studGrades.isEmpty()){
            average = sum/studGrades.size();
        }
        System.out.println("Average of all students: "+average);
    }
}
