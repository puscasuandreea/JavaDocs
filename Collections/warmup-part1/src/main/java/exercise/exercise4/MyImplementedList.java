package exercise.exercise4;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * You should implement from zero a data structure that acts as an ArrayList.
 * We have a default capacity of {@link MyImplementedList#DEFAULT_CAPACITY} elements of type <code>E</code>.
 * We have a {@link MyImplementedList#size} property that stores the number of elements of type <code>E</code> from the data structure.
 * We have an array property, {@link MyImplementedList#elementData}, that keeps the elements from the data structure.
 * We have a {@link MyImplementedList#LOAD_FACTOR} property that specify the maximum accepted load of the data structure.
 * We have a {@link MyImplementedList#INCREASE_SIZE_FACTOR} property to use it when we must increase the capacity of the data structure.
 * We have a {@link MyImplementedList#capacityAfterExtending} property to use it to retain the new capacity after increasing it.
 * <p>
 * Starting with this properties we must implement a data structure that acts ~ as an ArrayList for some objects of type <code>E</code>.
 * <p>
 * TODO if you need to throw some exceptions YOU MUST create them!
 * TODO if you get some warning from the compiler you can use @SuppressWarnings("all") before the method name!
 * TODO if you get this error "usage of api documented as @since 1.6+" you should go to File > Project Structure > Modules and make sure you have the Language level >= 1.6!
 * TODO you should expose as <code>public</code> only the methods that you usually use over a collection!
 * TODO if you need a getter/setter for the properties you must define then, but keep in mind the java concepts!
 * TODO make sure you cover all the possible use-cases for your data structure!
 *
 * @author Cristian.Dumitru
 * @since 7/3/2017.
 */
  class MyException extends Exception{
    MyException(String exceptie){
        super(exceptie);
    }

}


public class MyImplementedList<E> implements Iterable<E>{

    /**
     * The maximum accepted load property of the data structure.
     */
    private static final double LOAD_FACTOR = 0.75d;

    /**
     * The factor for increasing the size of the data structure.
     */
    private static final int INCREASE_SIZE_FACTOR = 2;

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * The size of the ArrayList (the number of elements it contains).
     */
    private int size;

    /**
     * The array buffer into which the elements of the {@link MyImplementedList} are stored.
     */
    private Object[] elementData;

    /**
     * Property to keep the extended capacity.
     * TODO if you choose another way to implement the extending capacity you can define your own properties,
     * TODO but the rest of them must remain as they are.
     */
    private int capacityAfterExtending;

    //TODO a) implement the empty constructor for the your data structure
    public MyImplementedList() {
        //TODO a) HINT - DEFAULT_CAPACITY, capacityAfterExtending and elementData properties
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.capacityAfterExtending = DEFAULT_CAPACITY;

    }

    //TODO b) create the int size() method that returns the size of the data structure
    public int size() {
        return size;
    }

    //TODO c) create the boolean add(E e) method that adds at the end of the data structure an element
    //TODO pay attention to the LOAD_FACTOR of the data structure
    public boolean add(E e) {
        return true;
    }


    //TODO d) create the boolean isEmpty() method that checks if the data structure have elements
    public boolean isEmpty() {
        return size == 0;
    }

    //TODO e) create the boolean contains(Object o_O) method that checks if the data structure contains the object o_O
    public boolean contains(Object o) {
        for (Object ob : elementData) {
            if (ob.equals(o)) {
                return true;
            }
        }
        return false;
    }


    //TODO f) create the int indexOf(Object o_O) method that returns the position in the data structure of the object o_O
    //TODO if exists, otherwise return -1i
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < this.size(); i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = 0; i < this.size(); i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;

    }

    //TODO g) create the int lastIndexOf(Object o_O) method that returns the last position in the data structure of the object o_O
    //TODO if exists, otherwise return -1
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = this.size() - 1; i >= 0; i--)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = this.size() - 1; i >= 0; i--)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    //TODO h) create the E get(int index) method that returns the object from the given index
    //TODO pay attention to the size property
    public E get(int index) {
        if (index < 0 || index >= this.size)
            throw new IndexOutOfBoundsException("outOfBoundsMsg");
        return (E) elementData[index];
    }


    //TODO i) create the E set(int index, E element) method that updates the value of the element from the given index
    //TODO pay attention to the size property
            public E set(int index,E element ){
                    if (index >= size)
                        throw new IndexOutOfBoundsException("outOfBoundsMsg");
                return (E) elementData[index];
            }
    //TODO j) create the E remove(int index) method that removes the element from the given index
            public E remove(int index){
                if (index < 0 || index >= this.size)
                    throw new IndexOutOfBoundsException("outOfBoundsMsg");
                return (E) elementData[index];
            }
    //TODO k) extend the current default capacity, if the number of elements in the data structure is > 75% of it
    //TODO you should name it: void extendCapacity(int capacity) - HINT use capacity, DEFAULT_CAPACITY, LOAD_FACTOR and INCREASE_SIZE_FACTOR
            public void extendCapacity(int capacity){
                if(size /capacityAfterExtending >LOAD_FACTOR){
                    capacityAfterExtending = capacityAfterExtending*INCREASE_SIZE_FACTOR;
                    Object [] obj1 = new Object[capacityAfterExtending];
                    for(int i = 0; i< size();i++){
                        obj1[i] = elementData[i];
                    }
                    elementData = obj1;
                }

                }


    //TODO l) implement the iterator() method in order to use the foreach statement over your data structure - HINT Iterable interface
    //TODO and implement a custom iterator for your custom data structure - methods boolean hasNext(), Object next() and void remove(){

    public Iterator<E> iterator() {
       Iterator<E> it = new Iterator<E>() {
           public boolean hasNext() {
               return false;
           }

           public E next() {
               return null;
           }

           public void remove() {

           }
       };
       return  it;
    }


    //TODO m) implement a method, that uses a Comparator, for your data structure to sort the elements
    //TODO you should name it: void sort(Comparator<? super E> c)
    //TODO create a custom comparator that compares objects by their "what you want" :D - HINT Comparator interface

}