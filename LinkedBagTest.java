import java.util.*;

public class LinkedBagTest {

    public static <T> void main(String[] args) {
        BagInterface<String> testBag1 = new LinkedBag<>();
        BagInterface<String> testBag2 = new LinkedBag<>();
        BagInterface<String> testBag3 = new LinkedBag<>();

        // add method
        testBag1.add("t");
        testBag1.add("w");

        testBag2.add("o");
        testBag2.add("o");
        testBag2.add("o");

        // print out contents in bag 1 and bag 2
        System.out.println("TEST BAG1 CONTENT: " + Arrays.toString(testBag1.toArray()));
        System.out.println("TEST BAG2 CONTENT: " + Arrays.toString(testBag2.toArray()));
        // getting current size
        System.out.println("BAG 1 CURRENT SIZE: " + testBag1.getCurrentSize());

        // checking if the bag isEmpty (false)
        System.out.println("BAG 1 IS EMPTY: " + testBag1.isEmpty());

        // remove method and isEmpty (true)
        testBag1.remove("w"); // remove specified entry
        testBag1.remove(); // remove unspecified entry
        System.out.println("BAG 1 IS EMPTY: " + testBag1.isEmpty());

        // readding elements to bag
        testBag1.add("a");
        testBag1.add("b");

        // getFrequencyOf method
        System.out.println("FREQUENCY OF \"o\": " + testBag2.getFrequencyOf("o") + "\n");

        // contains method (false)
        testBag1.contains("c");
        // contains method (true)
        testBag1.contains("a");

        // INTERSECTION METHOD TESTING
        System.out.println("---------- INTERSECTION METHOD TESTING ----------" + "\n");

        // intersection method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.intersection(testBag2);
        System.out.println(
                "Intersection Case 1 - when they don't have any matching elements: "
                        + Arrays.toString(testBag3.toArray()) + "\n");

        // intersection method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.intersection(testBag2);
        System.out
                .println("Intersection Case 2 - when they have matching elements: "
                        + Arrays.toString(testBag3.toArray()) + "\n");

        // intersection method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.intersection(testBag2);
        System.out
                .println("Intersection Case 3 - when one of the bags are null: " + Arrays.toString(testBag3.toArray())
                        + "\n");

        // intersection method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.intersection(testBag2);
        System.out.println(
                "Intersection Case 4 - when both bags are null: " + Arrays.toString(testBag3.toArray()) + "\n");

        // intersection method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.intersection(testBag2);
        System.out.println(
                "Intersection Case 4 - when all elements match: " + Arrays.toString(testBag3.toArray()) + "\n");

        // DIFFERENCE METHOD TESTING
        System.out.println("---------- DIFFERENCE METHOD TESTING ----------" + "\n");
        testBag1.clear();
        testBag2.clear();
        testBag3.clear();
        testBag1.add("t");
        testBag1.add("w");

        testBag2.add("o");
        testBag2.add("o");
        testBag2.add("o");

        // difference method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.difference(testBag2);
        System.out.println(
                "Difference Case 1 - when they don't have any matching elements: "
                        + Arrays.toString(testBag3.toArray()) + "\n");

        // difference method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.difference(testBag2);
        System.out
                .println(
                        "Difference Case 2 - when they have matching elements: " + Arrays.toString(testBag3.toArray())
                                + "\n");

        // difference method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.difference(testBag2);
        System.out.println(
                "Difference Case 3 - when one of the bags are null: " + Arrays.toString(testBag3.toArray()) + "\n");

        // difference method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.difference(testBag2);
        System.out
                .println("Difference Case 4 - when both bags are null: " + Arrays.toString(testBag3.toArray()) + "\n");

        // difference method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.difference(testBag2);
        System.out
                .println("Difference Case 4 - when all elements match: " + Arrays.toString(testBag3.toArray()) + "\n");

        // UNION METHOD TESTING
        System.out.println("---------- UNION METHOD TESTING ----------");
        testBag1.clear();
        testBag2.clear();
        testBag3.clear();
        testBag1.add("t");
        testBag1.add("w");

        testBag2.add("o");
        testBag2.add("o");
        testBag2.add("o");

        // union method: (case 1) when they don't have same elements
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.union(testBag2);
        System.out.println(
                "Union Case 1 - when they don't have any matching elements: "
                        + Arrays.toString(testBag3.toArray()) + "\n");

        // union method: (case 2) when they have same elements
        testBag1.add("o");
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.union(testBag2);
        System.out
                .println(
                        "Union Case 2 - when they have matching elements: " + Arrays.toString(testBag3.toArray())
                                + "\n");

        // union method: (case 3) when one is null
        testBag1.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.union(testBag2);
        System.out.println(
                "Union Case 3 - when one of the bags are null: " + Arrays.toString(testBag3.toArray()) + "\n");

        // union method: (case 4) when both are null
        testBag2.clear();
        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.union(testBag2);
        System.out
                .println("Union Case 4 - when both bags are null: " + Arrays.toString(testBag3.toArray()) + "\n");

        // union method: (case 5) when all elements match
        testBag1.add("c");
        testBag1.add("d");
        testBag1.add("e");
        testBag1.add("f");

        testBag2.add("c");
        testBag2.add("d");
        testBag2.add("e");
        testBag2.add("f");

        System.out.println("Bag 1: " + Arrays.toString(testBag1.toArray()) + "\n" + "Bag 2: "
                + Arrays.toString(testBag2.toArray()));
        testBag3 = testBag1.union(testBag2);
        System.out
                .println("Union Case 4 - when all elements match: " + Arrays.toString(testBag3.toArray()) + "\n");

    }
}
