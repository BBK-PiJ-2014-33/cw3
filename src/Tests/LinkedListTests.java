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
    public void addEndListTest()
    {
        //test null object insertion scenario

        ReturnObject myReturnObject = new ReturnObjectImpl();
        Object expected = ErrorMessage.INVALID_ARGUMENT;
        Object output;
        List myList = new LinkedList();
        myList.add("test");
        myReturnObject = myList.add(null);
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test legitimate item scenario

        expected = ErrorMessage.NO_ERROR;
        myReturnObject = myList.add("test");
        output = myReturnObject.getError();
        assertEquals(output, expected);
    }

    public void addTest()
    {
        ReturnObject myReturnObject = new ReturnObjectImpl();

        //test null object insertion scenario
        List myList = new LinkedList();
        Object expected = ErrorMessage.INVALID_ARGUMENT;
        Object output;
        myList.add("zero");
        myList.add("two");
        myList.add("three");
        myReturnObject = myList.add(1,null);
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test trying to insert using -ve index
        expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
        myReturnObject = myList.add(-3,"one");
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test trying to insert using index greater than the size of the list
        myReturnObject = myList.add(4,"one");
        output = null; //clear previous output to make sure it is not left over from previous test
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test legitimate input and make sure that elements at and after that position updated accordingly
        expected = "two";
        myList.add(1,"one");
        myReturnObject = myList.get(2);
        output = myReturnObject.getReturnValue();
        assertEquals(output, expected);
        expected = "three";
        myReturnObject = myList.get(3);
        output = myReturnObject.getReturnValue();
        assertEquals(output, expected);
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
        assertEquals(output, expected);

        //test that appropriate error message is returned when trying to get item from non existent index
        expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
        myList.add("zero");
        myReturnObject = myList.get(-1);
        output = myReturnObject.getError();
        assertEquals(output, expected);

        myReturnObject = myList.get(2);
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test that correct item is returned
        myList.add("one");
        myList.add("two");
        expected = "one";
        myReturnObject = myList.get(1);
        output = myReturnObject.getReturnValue();
        assertEquals(output, expected);
    }

    @Test
    public void validIndexNullTest()
    {
        //test to ensure there is no null at valid position (between 0 and size -1) of the List

        ReturnObject myObject = new ReturnObjectImpl();
        List myList = new LinkedList();
        myList.add("zero");
        myList.add("one");
        myList.add("two");
        int listSize;
        listSize = myList.size();

        for ( int i =0; i>listSize; i++)
        {
            myObject = myList.get(i);
            assertNotNull(myObject.getReturnValue());
        }

    }

}
