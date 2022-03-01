import java.util.Arrays;

public class bagDriver {
    public static void main(String[] args) {
        // ResizableArrayBag Test
        BagInterface<String> BAG1 = new ResizableArrayBag<>();
        BagInterface<String> BAG2 = new ResizableArrayBag<>();

        BAG1.add("A");
        BAG1.add("A");
        BAG1.add("B");
        BAG1.add("C");
        BAG1.add("A");
        BAG1.add("B");
        BAG1.add("G");

        BAG2.add("B");
        BAG2.add("U");
        BAG2.add("A");
        BAG2.add("A");
        BAG2.add("B");
        BAG2.add("G");
        System.out.println("Contents of RArrayBag 1: " + Arrays.toString(BAG1.toArray()));
        System.out.println("Contents of RArrayBag 2: " + Arrays.toString(BAG2.toArray()));

        System.out.println("Union: " + Arrays.toString(BAG1.union(BAG2).toArray()));

        System.out.println("Difference: " + Arrays.toString(BAG1.difference(BAG2).toArray()));

        System.out.println("Intersection: " + Arrays.toString(BAG1.intersection(BAG2).toArray()));

        // LinkedBag Test
        BagInterface<String> LBAG1 = new LinkedBag<>();
        BagInterface<String> LBAG2 = new LinkedBag<>();

        LBAG1.add("A");
        LBAG1.add("B");
        LBAG1.add("z");
        LBAG1.add("A");
        LBAG1.add("B");
        // LBAG1.add("G");

        // LBAG2.add("B");
        // LBAG2.add("U");
        // LBAG2.add("A");
        LBAG2.add("m");
        LBAG2.add("B");
        LBAG2.add("G");
        LBAG2.add("y");
        System.out.println("Contents of LinkedBag 1: " + Arrays.toString(LBAG1.toArray()));
        System.out.println("Contents of LinkedBag 2: " + Arrays.toString(LBAG2.toArray()));

        System.out.println("Union: " + Arrays.toString(LBAG1.union(LBAG2).toArray()));

        System.out.println("Difference: " + Arrays.toString(LBAG1.difference(LBAG2).toArray()));

        System.out.println("Intercection: " + Arrays.toString(LBAG1.intersection(LBAG2).toArray()));

    }
}
