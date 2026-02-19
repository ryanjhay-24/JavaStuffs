import java.util.ArrayList;
class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Skibs");
        words.add("Skoops");
        words.add("Skibskops");
        words.add("Skibskops");

        System.out.println("Before popping: " + words);
        words.remove(0);

        System.out.println("After popping: " + words);

        System.out.println("The word at index 0 is: " + words.get(0));
    }
}
