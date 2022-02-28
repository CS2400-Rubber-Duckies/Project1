public class bagDriver {
    public static void main(String[] args) {



        // ArrayBag test'



    BagInterface<String> BAG = new ResizableArrayBag<>();

        String[] ContentsBag1 ={"A","B","A","A","C","B"};
        String[] ContentsBag2 ={"A","B","A","C","D"};
         
        BAG.add("w");

System.out.println(BAG);

ResizableArrayBag union = BAG.union( ContentsBag1 []);
System.out.println("Union cap: " + union.getCurrentSize());

System.out.println(union);

        // LinkedBag test

        // union
        // test case 1
      //  Integer[] bag1 = { 1, 2 };
       // Integer[] bag2 = { 1 };
        // test case 2 (duplicates)
       // Integer[] bag1 = { 1, 2, 3, 2 };
       // Integer[] bag2 = { 1, 2 };
        // test case 3
       // Integer[] bag1 = { 1, 2, 3, 2 };
       // Integer[] bag2 = { 1, 2 };
        // test case 4

        // test case 5

        // test case 6

    }
}
