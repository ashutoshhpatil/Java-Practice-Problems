package Collection;

public class ComparableInterface {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("A"));
        //System.out.println("A".compareTo(null));  (Exception in thread "main" java.lang.NullPointerException)
    }
}
/*Step-by-Step Calculation for "Z".compareTo("A"):
et ASCII/Unicode Values:
ASCII value of 'Z' = 90
ASCII value of 'A' = 65
Subtract the values:
90 - 65 = 25*

 */