import java.util.*;

public class ResizableArrayBag<T> implements BagInterface<T>{

    private  T[] bag;
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
        if (!isEmpty()) {
            T toRemove = bag[new Random().nextInt(getCurrentSize())];

            T[] temp = (T[]) new Object[getCurrentSize() - 1];
            for (int i = 0, j = 0; i < getCurrentSize(); i++)
                if (bag[i] != toRemove)
                    temp[j++] = bag[i];

            bag = temp;
            numberOfEntries = temp.length;
            return toRemove;
        }
        else
            return null;
    }

    @Override
    public boolean remove(T anEntry) {
        if (!isEmpty() && contains(anEntry)){
        boolean removed = false;
        T[] temp = (T[]) new Object[getCurrentSize() - 1];
        for (int i = 0, j = 0; i < getCurrentSize(); i++)
                if (!bag[i].equals(anEntry) || removed)
                    temp[j++] = bag[i];
                else if (bag[i].equals(anEntry))
                    removed = true; //to avoid multiple removal

            bag = temp;
            numberOfEntries = temp.length;
            return true;

    }
    else
    return false;
}


    @Override
    public void clear() {
        while (!isEmpty())
        remove();
        
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
       }return counter;
    }

    @Override
    public boolean contains(T anEntry) {
        if (!isEmpty()) {
            for (T items : bag)
                if (items.equals(anEntry))
                    return true;
        }
        return false; 
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
        
        BagInterface<T> bag3 = new ResizableArrayBag<T>();
        int newLength = this.getCurrentSize() + bag.getCurrentSize();
       
        T[] bag1 = this.toArray();
		T[] bag2 = bag.toArray();

      
        

    }

   

    
   
    
}
