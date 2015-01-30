package Tests;
import org.junit.*;
import List.*;
import static org.junit.Assert.*;

public class ListTests {

    @Test
    public void isEmptyTest(){

        List myArrayList = new ArrayList(1);
        List myLinkedList = new LinkedList();

        boolean outputArrayList;
        boolean outputLinkedList;

        boolean expected = true;

        outputArrayList = myArrayList.isEmpty();
        assertEquals(outputArrayList,expected);

        outputLinkedList = myLinkedList.isEmpty();
        assertEquals(outputLinkedList,expected);

        expected = false;

        myArrayList.add("test");
        outputArrayList = myArrayList.isEmpty();
        assertEquals(outputArrayList,expected);

        myLinkedList.add("test");
        outputLinkedList = myLinkedList.isEmpty();
        assertEquals(outputLinkedList,expected);

    }

    @Test
    public void sizeTest()
    {
        int expectedSize = 2;
        int outputSize;
        List myArrayList = new ArrayList(3);
        myArrayList.add("test");
        myArrayList.add("test");
        outputSize = myArrayList.size();
        assertEquals(outputSize,expectedSize);
    }
    @Test
    public void getTest() {
        /**
         * Returns the elements at the given position.
         *
         * If the index is negative or greater or equal than the size of
         * the list, then an appropriate error must be returned.
         *
         * @param index the position in the list of the item to be retrieved
         * @return the element or an appropriate error message,
         *         encapsulated in a Support.ReturnObject
         */

        //public ReturnObject get(int index);
    }

    @Test
    public void removeTest() {
        /**
         * Returns the elements at the given position and removes it
         * from the list. The indeces of elements after the removed
         * element must be updated accordignly.
         *
         * If the index is negative or greater or equal than the size of
         * the list, then an appropriate error must be returned.
         *
         * @param index the position in the list of the item to be retrieved
         * @return the element or an appropriate error message,
         *         encapsulated in a Support.ReturnObject
         */

        //public ReturnObject remove(int index);
    }

    @Test
    public void addTest() {
        /**
         * Adds an element to the list, inserting it at the given
         * position. The indeces of elements at and after that position
         * must be updated accordignly.
         *
         * If the index is negative or greater or equal than the size of
         * the list, then an appropriate error must be returned.
         *
         * If a null object is provided to insert in the list, the
         * request must be ignored and an appropriate error must be
         * returned.
         *
         * @param index the position at which the item should be inserted in
         *              the list
         * @param item the value to insert into the list
         * @return an Support.ReturnObject, empty if the operation is successful
         *         the item added or containing an appropriate error message
         */

        //public ReturnObject add(int index, Object item);

        /**
         * Adds an element at the end of the list.
         *
         * If a null object is provided to insert in the list, the
         * request must be ignored and an appropriate error must be
         * returned.
         *
         * @param item the value to insert into the list
         * @return an Support.ReturnObject, empty if the operation is successful
         *         the item added or containing an appropriate error message
         */

        //public ReturnObject add(Object item);

    }
}
