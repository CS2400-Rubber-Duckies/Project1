import java.util.*;

public class ResizableArrayBagTest {
    public static <T> void main(String[] args) {

        // // Create a Scanner object for user input.
        // Scanner in = new Scanner(System.in);

        // // Create an ArrayBag named bag1.
        // System.out.print("Size of bag 1: ");
        // int size = in.nextInt();
        // ResizableArrayBag<T> bag1 = new ResizableArrayBag<T>(size);
        // in.nextLine(); // consume the rest of the line

        // // ****** Additions *****

        // // Display capacity of new bag
        // System.out.println("Bag 1 can hold up to " + bag1.getCurrentSize() + "
        // items.");

        // // Determine if ArrayBag is full
        // // if (bag1.isFull())
        // // System.out.println("Bag is full.");
        // // else
        // // System.out.println("Bag is NOT full.");

        // // Read in strings, add them to bag1, and print out bag1.
        // String itemStr;
        // for (int i = 0; i < size; i++) {
        // System.out.print("item " + i + ": ");
        // itemStr = in.nextLine();
        // bag1.add(itemStr);
        // }
        // System.out.println("bag 1 = " + bag1);
        // System.out.println();

        // // Increase capacity by 2
        // System.out.println("Increasing Bag 1 capacity by 2.");
        // bag1.add(2);
        // System.out.println("Bag 1 can hold up to " + bag1.getCurrentSize() + "
        // items.");

        // // Select a random item and print it.
        // Object item = bag1.grab();
        // System.out.println("grabbed " + item);
        // System.out.println();

        // // Iterate over the objects in bag1, printing them one per
        // // line.
        // Object[] items = bag1.toArray();
        // for (int i = 0; i < items.length; i++)
        // System.out.println(items[i]);
        // System.out.println();

        // // Get an item to remove from bag1, remove it, and reprint the bag.
        // System.out.print("item to remove: ");
        // itemStr = in.nextLine();
        // if (bag1.contains(itemStr))
        // bag1.remove(itemStr);
        // System.out.println("bag 1 = " + bag1);
        // System.out.println();

        // // Remove all items from bag1 and reprint the bag.
        // ResizableArrayBag<T> other1 = new ResizableArrayBag<T>(2);
        // other1.add("ff");
        // other1.add("aa");
        // System.out.println("Removing all items {aa, ff}");
        // bag1.remove(other1);
        // System.out.println("bag 1 = " + bag1);
        // System.out.println();

        // // Create two ArrayBags and return their union (with no duplicates)
        // // {2, 2, 3, 5, 7, 7, 7, 8}
        // ResizableArrayBag<T> b1 = new ResizableArrayBag<T>(8);
        // b1.add("2");
        // b1.add("2");
        // b1.add("3");
        // b1.add("5");
        // b1.add("7");
        // b1.add("7");
        // b1.add("7");
        // b1.add("8");
        // System.out.println("Bag b1 is " + b1);

        // // {2, 3, 4, 5, 5, 6, 7}
        // ResizableArrayBag<T> b2 = new ResizableArrayBag<T>(7);
        // b2.add("2");
        // b2.add("3");
        // b2.add("4");
        // b2.add("5");
        // b2.add("5");
        // b2.add("6");
        // b2.add("7");
        // System.out.println("Bag b2 is " + b2);

        // // Be sure to test case with zero items
        // ResizableArrayBag<T> b3 = new ResizableArrayBag<T>();
        // b3 = b1.union(b2);
        // System.out.println("Union of b1 & b2 is " + b3);
        // System.out.println("b3 size is " + b3.getCurrentSize());
        // System.out.println();

        // create ResizableArrayBag with DefaultCapacity
        ResizableArrayBag<T> b1 = new ResizableArrayBag<T>();

    }
}
