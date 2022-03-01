import java.util.*;

public class ResizableArrayBagTest {
    public static <T> void main(String[] args) {
        BagInterface<String> testBag1 = new ResizableArrayBag<>();
        BagInterface<String> testBag2 = new ResizableArrayBag<>();

        // add method
        testBag1.add("t");
        testBag1.add("w");

        testBag2.add("o");
        testBag2.add("o");
        testBag2.add("o");

        // print out contents in bag 1 and bag 2
        System.out.println("TEST BAG1 CONTENT: " + testBag1);
        System.out.println("TEST BAG2 CONTENT: " + testBag2);
        // getting current size
        System.out.println("BAG1 CURRENT SIZE: " + testBag1.getCurrentSize());

        // checking if the bag isEmpty (false)
        System.out.println("BAG1 IS EMPTY: " + testBag1.isEmpty());

        // remove method and isEmpty (true)
        testBag1.remove("w"); // remove specified entry
        testBag1.remove(); // remove unspecified entry
        System.out.println("BAG1 IS EMPTY: " + testBag1.isEmpty());

        // readding elements to bag
        testBag1.add("a");
        testBag1.add("b");

        // getFrequencyOf method
        testBag2.getFrequencyOf("o");
        System.out.println(testBag2);

        // contains method (false)
        testBag1.contains("c");
        // contains method (true)
        testBag1.contains("a");

        // INTERSECTION METHOD TESTING
        System.out.println("---------- INTERSECTION METHOD TESTING ----------");

        // intersection method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println(
                "Intersection Case 1 - when they don't have any matching elements: " + testBag1.intersection(testBag2));

        // intersection method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out
                .println("Intersection Case 2 - when they have matching elements: " + testBag1.intersection(testBag2));

        // intersection method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Intersection Case 3 - when one of the bags are null: " + testBag1.intersection(testBag2));

        // intersection method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Intersection Case 4 - when both bags are null: " + testBag1.intersection(testBag2));

        // intersection method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Intersection Case 4 - when all elements match: " + testBag1.intersection(testBag2));

        // DIFFERENCE METHOD TESTING
        System.out.println("---------- DIFFERENCE METHOD TESTING ----------");

        // difference method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println(
                "Difference Case 1 - when they don't have any matching elements: " + testBag1.difference(testBag2));

        // difference method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out
                .println("Difference Case 2 - when they have matching elements: " + testBag1.difference(testBag2));

        // difference method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 3 - when one of the bags are null: " + testBag1.difference(testBag2));

        // difference method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 4 - when both bags are null: " + testBag1.difference(testBag2));

        // difference method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 4 - when all elements match: " + testBag1.difference(testBag2));

        // UNION METHOD TESTING
        System.out.println("---------- UNION METHOD TESTING ----------");

        // union method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println(
                "Difference Case 1 - when they don't have any matching elements: " + testBag1.union(testBag2));

        // union method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out
                .println("Difference Case 2 - when they have matching elements: " + testBag1.union(testBag2));

        // union method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 3 - when one of the bags are null: " + testBag1.union(testBag2));

        // union method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 4 - when both bags are null: " + testBag1.union(testBag2));

        // union method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + testBag1 + "\n" + "Bag 2: " + testBag2);
        System.out.println("Difference Case 4 - when all elements match: " + testBag1.union(testBag2));

    }
}
