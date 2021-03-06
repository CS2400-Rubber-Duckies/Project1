public final class LinkedBag<T> implements BagInterface<T> {
	private Node firstNode; // Reference to first node
	private int numberOfEntries;

	public LinkedBag() {
		firstNode = null;
		numberOfEntries = 0;
	} // end default constructor

	/**
	 * Adds a new entry to this bag.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 * @return True.
	 */
	public boolean add(T newEntry) // OutOfMemoryError possible
	{
		// Add to beginning of chain:
		Node newNode = new Node(newEntry);
		newNode.next = firstNode; // Make new node reference rest of chain
									// (firstNode is null if chain is empty)
		firstNode = newNode; // New node is at beginning of chain
		numberOfEntries++;

		return true;
	} // end add

	/**
	 * Retrieves all entries that are in this bag.
	 * 
	 * @return A newly allocated array of all the entries in this bag.
	 */
	public T[] toArray() {
		// The cast is safe because the new array contains null entries.
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfEntries]; // Unchecked cast

		int index = 0;
		Node currentNode = firstNode;
		while ((index < numberOfEntries) && (currentNode != null)) {
			result[index] = currentNode.data;
			index++;
			currentNode = currentNode.next;
		} // end while

		return result;
		// Note: The body of this method could consist of one return statement,
		// if you call Arrays.copyOf
	} // end toArray

	/**
	 * Sees whether this bag is empty.
	 * 
	 * @return True if the bag is empty, or false if not.
	 */
	public boolean isEmpty() {
		return numberOfEntries == 0;
	} // end isEmpty

	/**
	 * Gets the number of entries currently in this bag.
	 * 
	 * @return The integer number of entries currently in the bag.
	 */
	public int getCurrentSize() {
		return numberOfEntries;
	} // end getCurrentSize

	// STUBS:
	private class Node {
		private T data; // Entry in bag
		private Node next; // Link to next node

		private Node(T dataPortion) {
			this(dataPortion, null);
		} // end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} // end constructor
	} // end Node

	/**
	 * Removes one unspecified entry from this bag, if possible.
	 * 
	 * @return Either the removed entry, if the removal
	 *         was successful, or null.
	 */
	public T remove() {
		T result = null;
		if (firstNode != null) {
			result = firstNode.data;
			firstNode = firstNode.next; // Remove first node from chain
			numberOfEntries--;
		} // end if
		return result;
	} // end remove

	// public Node getReferenceTo(T anEntry) {
	// boolean check = false;
	// Node currentNode = firstNode;
	// while (!check && (currentNode != null)) {
	// if (anEntry.equals(currentNode.data)) {
	// check = true;
	// } else {
	// currentNode = currentNode.next;
	// }
	// }
	// return currentNode;
	// } // end remove

	/**
	 * Removes one occurrence of a given entry from this bag.
	 * 
	 * @param anEntry The entry to be removed.
	 * @return True if the removal was successful, or false otherwise.
	 */
	@Override
	public boolean remove(T anEntry) {
		boolean result = false;
		boolean check = false;
		Node currentNode = firstNode;
		while (!check && (currentNode != null)) {
			if (anEntry.equals(currentNode.data)) {
				check = true;
			} else {
				currentNode = currentNode.next;
			}
		}
		Node nodeN = currentNode;

		if (nodeN != null) {
			nodeN.data = firstNode.data; // Replace located entry with entry in first node
			firstNode = firstNode.next; // Remove first node
			numberOfEntries--;
			result = true;
		} // end if
		return result;
	} // end remove

	/** Removes all entries from this bag. */
	public void clear() {
		while (!isEmpty()) {
			remove();
		}
	} // end clear

	/**
	 * Counts the number of times a given entry appears in this bag.
	 * 
	 * @param anEntry The entry to be counted.
	 * @return The number of times anEntry appears in the bag.
	 */
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		int loopCounter = 0;
		Node currentNode = firstNode;

		while ((loopCounter < numberOfEntries) && (currentNode != null)) {
			if (anEntry.equals(currentNode.data)) {
				frequency++;
			}

			loopCounter++;
			currentNode = currentNode.next;
		}

		return frequency;
	} // end getFrequencyOf

	/**
	 * Tests whether this bag contains a given entry.
	 * 
	 * @param anEntry The entry to locate.
	 * @return True if the bag contains anEntry, or false otherwise.
	 */
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;

		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		} // end while
		return found;
	} // end contains

	@Override
	public BagInterface<T> intersection(BagInterface<T> bag) {
		BagInterface<T> bag3 = new LinkedBag<T>();
		// compare bag1 and bag2 then remove
		int length;
		if (this.getCurrentSize() > bag.getCurrentSize()) {
			length = this.getCurrentSize();
		} else {
			length = bag.getCurrentSize();
		}

		T[] bag1 = this.toArray();
		T[] bag2 = bag.toArray();

		if (bag1 == null || bag2 == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}
		for (int i = 0; i < length -1; i++) {
			if (this.contains(bag2[i])) {
				if (!bag3.contains(bag2[i])) {
					bag3.add(bag1[i]);
				}
			}
		}
		return bag3;
	}

	@Override
	public BagInterface<T> union(BagInterface<T> bag) {
		BagInterface<T> bag3 = new LinkedBag<T>(); // made a new array to the union in
		// while looping through the bag, add unique node
		// if we already have it in bag3, then don't add
		int length;
		if (this.getCurrentSize() > bag.getCurrentSize()) {
			length = this.getCurrentSize();
		} else {
			length = bag.getCurrentSize();
		}

		T[] bag1 = this.toArray();
		T[] bag2 = bag.toArray();

		if (bag1 == null || bag2 == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}

		for (int i = 0; i < length -1; i++) {
			if (!bag3.contains(bag1[i])) {
				bag3.add(bag1[i]);
			}
			if (!bag3.contains(bag2[i])) {
				bag3.add(bag2[i]);
			}
		}
		return bag3;
	}

	@Override
	public BagInterface<T> difference(BagInterface<T> bag) {
		BagInterface<T> bag3 = new LinkedBag<T>(); // made a new array to the union in

		int length;
		if (this.getCurrentSize() > bag.getCurrentSize()) {
			length = this.getCurrentSize();
		} else {
			length = bag.getCurrentSize();
		}

		T[] bag1 = this.toArray();
		T[] bag2 = bag.toArray();

		if (bag1 == null || bag2 == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}

		for (int i = 0; i < length -1 ; i++) {
			for (int j = 0; j < bag.getCurrentSize(); j++) {
				if (bag1[i] == bag2[j]) {
					bag3.remove(bag1[i]);
					// remove element from bag if they are the same
					// result is removal of all elements in common
				}
			}
		}
		return bag3;
	}

} // end of LinkedBag1
