import java.util.*;

public class ResizableArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private static final int Default_Capacity = 25;
    private int numberOfEntries;

    public ResizableArrayBag() {
        this(Default_Capacity);
    }

    @SuppressWarnings("unchecked")
    public ResizableArrayBag(int capacity) {
        numberOfEntries = 0;
        @SuppressWarnings("Unchecked")
        T[] tempBag = (T[]) new Object[capacity];
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

        if (bag.length > Default_Capacity) {
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) new Object[(getCurrentSize() + 1) * 2]; // resizing if capacity reached
            for (int i = 0; i < getCurrentSize(); i++)
                temp[i] = bag[i];
            temp[getCurrentSize()] = newEntry;
            bag = temp;
            numberOfEntries = temp.length;
            return true;

        } else if (bag.length <= Default_Capacity) {
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) new Object[getCurrentSize() + 1];
            for (int i = 0; i < getCurrentSize(); i++)
                temp[i] = bag[i];
            temp[getCurrentSize()] = newEntry;
            bag = temp;
            numberOfEntries = temp.length;
            return true;
        } else
            return false;

    }

    @Override
    public T remove() {
        if (!isEmpty()) {
            T toRemove = bag[new Random().nextInt(getCurrentSize())];
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) new Object[getCurrentSize() - 1];
            for (int i = 0, j = 0; i < getCurrentSize(); i++)
                if (bag[i] != toRemove)
                    temp[j++] = bag[i];

            bag = temp;
            numberOfEntries = temp.length;
            return toRemove;
        } else
            return null;
    }

    @Override
    public boolean remove(T anEntry) {
        if (!isEmpty() && contains(anEntry)) {
            boolean removed = false;
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) new Object[getCurrentSize() - 1];
            for (int i = 0, j = 0; i < getCurrentSize(); i++)
                if (!bag[i].equals(anEntry) || removed)
                    temp[j++] = bag[i];
                else if (bag[i].equals(anEntry))
                    removed = true; // to avoid multiple removal

            bag = temp;
            numberOfEntries = temp.length;
            return true;

        } else
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

        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                counter++;
            } // end if
        }
        return counter;
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
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> bag) {
        BagInterface<T> bag3 = new ResizableArrayBag<T>();
        // T[] bag1 = this.toArray();
        // T[] bag2 = bag.toArray();
        if (this == null || bag == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}
        for (T item1 : bag.toArray())
            for (T item2 : this.toArray()) {
                if (item1.equals(item2)) {
                    this.remove(item1);
                    bag.remove(item2);
                    bag3.add(item1);
                    break;
                }
            }
        return bag3;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        BagInterface<T> bag3 = new ResizableArrayBag<T>();
        // int newLength = this.getCurrentSize() + bag.getCurrentSize();
        

        T[] bag1 = this.toArray();
        T[] bag2 = bag.toArray();
        if (bag1 == null || bag2 == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}

        for (T item1 : bag1) {
            bag3.add(item1);
        }
        for (T item2 : bag2) {
            bag3.add(item2);
        }

        for (T item1 : bag1) {
            for (T item2 : bag2) {
                if (item1.equals(item2)) {
                    bag3.remove(item1);
                    bag3.remove(item2);
                    break;
                }
            }
        }
        return bag3;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag) {

        BagInterface<T> bag3 = new ResizableArrayBag<T>();
        int newLength = this.getCurrentSize() + bag.getCurrentSize();

        T[] bag1 = this.toArray();
        T[] bag2 = bag.toArray();
        if (bag1 == null || bag2 == null) {
			throw new IllegalArgumentException("Bag(s) cannot be null.");
		}
        if (newLength <= Default_Capacity || newLength > Default_Capacity) {
            for (T anEntry : bag2)
                bag3.add(anEntry);
            for (T anEntry : bag1)
                bag3.add(anEntry);
        }

        return bag3;
    }

}
