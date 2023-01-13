import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> fruitsArray = new ArrayList<>();

        fruitsArray.add("Morango");
        fruitsArray.add("Morango");
        fruitsArray.add("Uva");
        fruitsArray.add("Melancia");

        // Not using the List above, just playing around with the ArrayList class

        String[] fruitsArray1 = new String[] { "Morango", "Morango", "Uva", "Melancia" };
        String[] fruitsArray2 = new String[] { "Abacaxi", "Laranja", "Melao", "Morango" };

        System.out.println(Arrays.toString(fruitsArray1));
        System.out.println(Arrays.toString(fruitsArray2));

        System.out.println("-------------------------------------------");
        System.out.println("Elementos em comum entre os dois Arrays:");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < fruitsArray1.length; i++) {
            for (int j = i; j < fruitsArray2.length; j++) {
                if (fruitsArray1[i].equals(fruitsArray2[j])) {
                    fruitsArray2[j] = null; // If equal, entry is deleted to not appear a second time in future
                                            // interactions
                    System.out.println(fruitsArray1[i]);
                }
            }
        }
    }
}
