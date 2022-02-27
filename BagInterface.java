/** An interface that describes the operations of a bag of objects. */
public interface BagInterface<T> {
    /**
     * Gets the current number of entries in this bag.
     * 
     * @return The integer number of entries currently in the bag.
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is empty.
     * 
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty();
    public boolean isFull();

    /**
     * Adds a new entry to this bag.
     * 
     * @param newEntry The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T newEntry);

    /**
     * Removes one unspecified entry from this bag, if possible.
     * 
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T remove();

    /**
     * Removes one occurrence of a given entry from this bag, if possible.
     * 
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /**
     * Counts the number of times a given entry appears in this bag.
     * 
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in the bag.
     */
    public int getFrequencyOf(T anEntry);

    

    /**
     * Tests whether this bag contains a given entry.
     * 
     * @param anEntry The entry to find.
     * @return True if the bag contains anEntry, or false if not.
     */
    public boolean contains(T anEntry);

    /**
     * Locates a specified entry in a bag.
     * 
     * @param anEntry The entry to find.
     * @return True if the bag contains anEntry, or false if not.
     */
  

    /**
     * Retrieves all entries that are in this bag.
     * 
     * @return A newly allocated array of all the entries in the bag. Note: If the
     *         bag is empty, the returned array is empty.
     */
    public T[] toArray();

    /** items that bag 1 and 2 have in common
     * @return a new bag wiht common entry of bag1 and bag2
     */

    public BagInterface<T> intersection(BagInterface<T> bag);

    /**return eveything else except itme thay have in common
     * @return 
     */
    public BagInterface<T> difference(BagInterface<T> bag);


    /** Returns the union of bag1 and bag2
     * @return a new bag that contians items from bag1 and bag2
     */
    
    public BagInterface<T> union(BagInterface<T> bag);

} // end BagInterface