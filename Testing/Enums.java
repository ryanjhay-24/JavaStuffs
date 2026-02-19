import java.util.Scanner;
public class Enums {

 public   enum Strings{ 
        SUNDAY,
        MONDAY,
        TUESDAY, 
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(Strings.SUNDAY);

    sc.close();
}
    

    
}
