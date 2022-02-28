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
    System.out.println("Contents of bag 1: " + Arrays.toString(BAG1.toArray()));
    System.out.println("Contents of bag 2: " + Arrays.toString(BAG2.toArray()));

    System.out.println("Union: "+ Arrays.toString(BAG1.union(BAG2).toArray()));
    

    
    //  String[] ContentsBag1 ={"A","B","A","A","C","B"};
      //  String[] ContentsBag2 ={"A","B","A","C","D"};
         
     //   BAG.add("w");

////System.out.println(BAG);

//ResizableArrayBag union = (ResizableArrayBag) BAG.union(BAG);
//System.out.println("Union capacity: " + union.getCurrentSize());

//System.out.println(BAG.union(BAG));

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
