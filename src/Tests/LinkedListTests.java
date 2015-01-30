package Tests;

import List.*;
import Support.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LinkedListTests {

    @Test
    public void isEmptyTest(){

        List myList = new LinkedList();

        boolean output;
        boolean expected = true;

        output = myList.isEmpty();
        assertEquals(output,expected);

        expected = false;

        myList.add("test");
        output = myList.isEmpty();
        assertEquals(output,expected);

    }

    @Test
    public void sizeTest()
    {
        int expectedSize = 2;
        int outputSize;
        List myList = new LinkedList();
        myList.add("test");
        myList.add("test");
        outputSize = myList.size();
        assertEquals(outputSize,expectedSize);
    }
    @Test
    public void getTest() {

        ReturnObject myReturnObject = new ReturnObjectImpl();
        Object expected = ErrorMessage.EMPTY_STRUCTURE;
        Object output;

        //test that appropriate error message is returned when trying to get item from empty list
        List myList = new LinkedList();
        myReturnObject = myList.get(1);
        output = myReturnObject.getError();
        assertEquals(output,expected);

        //test that appropriate error message is returned when trying to get item from non existent index
        expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
        myList.add("zero");
        myReturnObject = myList.get(-1);
        output = myReturnObject.getError();
        assertEquals(output,expected);

        myReturnObject = myList.get(2);
        output = myReturnObject.getError();
        assertEquals(output,expected);

        /**
         //test that correct item is returned
         myList.add("one");
         myList.add("two");
         expected = "two";
         myReturnObject = myList.get(2);
         output = myReturnObject.getReturnValue();
         assertEquals(output,expected);
         */

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
