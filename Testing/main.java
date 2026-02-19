
import java.util.Vector;
import java.util.Scanner;
class main {

    class enumsss{
        enum Months {

            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
            
        }
    }
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word (1/4): ");
        String word = scanner.nextLine();
        System.out.println("Enter a word (2/4): ");
        String word2 = scanner.nextLine();
        System.out.println("Enter a word (3/4): ");
        String word3 = scanner.nextLine();
        System.out.println("Enter a word (4/4): ");
        String word4 = scanner.nextLine();
        vector.addElement(word);
        vector.addElement(word2);
        vector.addElement(word3);
        vector.addElement(word4);

        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println("Type the word you want to find: ");
        String wordToFind = scanner.nextLine();

        if (vector.contains(wordToFind)) {
            System.out.println("The word is found at index: " + (vector.indexOf(wordToFind) + 1)+" slot");
        } else {
            System.out.println("The word is not found");
        }

        scanner.close();
    }
}