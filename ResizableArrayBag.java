public class ResizableArrayBag<T> implements BagInterface<T>{

    private final T[] bag;
    private static final int Defualt_Capacity = 25;
    private int numberOfEntries;

    public ResizableArrayBag(){
        this(Defualt_Capacity);
    }

    public ResizableArrayBag(int capacity){
        numberOfEntries =0;
        @SuppressWarnings("Unchecked")
        T [] tempBag = (T[])new Object[capacity];
        bag = tempBag;

    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull()){
            int newLength = 2 * bag.length;
           
            bag = ResizableArrayBag.copyOf(bag, newLength);
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;

    }
    @Override
    public boolean isFull() {
       return numberOfEntries == bag.length;
           }


    @Override
    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
return result;
    }

    @Override
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
      T result = removeEntry(index);         
      return anEntry.equals(result);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
      
      for (int index = 0; index < numberOfEntries; index++)
      {
         if (anEntry.equals(bag[index]))
         {
             counter++;
         } // end if
       }
    }

    @Override
    public boolean contains(T anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Node getReferenceTo(T anEntry) {
        boolean found = false;
		Node currentNode = firstNode;
		
		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		} // end while
     
		return currentNode;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        for (int index=0 ;index< numberOfEntries; index++){
            result [index] = bag [index]; 
        }
        return result;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }

   

    
   
    
}
