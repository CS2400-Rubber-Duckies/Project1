public class LinkedBagTest {
   
    public static <T> void main(String[] args) {
    BagInterface<String> testBag1 = new LinkedBag<>();
    BagInterface<String> testBag2 = new LinkedBag<>();
//ADD
testBag1.add("t");
testBag1.add("w");
testBag2.add("o");
testBag2.add("o");
testBag2.add("o");

System.out.println(testBag1 );
System.out.println(testBag2 );

//remove
testBag1.remove("w");
System.out.println(testBag1);
//getfrequency

testBag2.getFrequencyOf("o");
System.out.println(testBag2);

}}

