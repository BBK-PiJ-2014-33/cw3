package Tests;
import Support.*;
import org.junit.*;
import List.*;
import static org.junit.Assert.*;

public class ArrayListTests {

    @Test
    public void isEmptyTest(){

        List myList = new ArrayList(1);

        boolean outputArrayList;
        boolean expected = true;

        outputArrayList = myList.isEmpty();
        assertEquals(outputArrayList,expected);

        expected = false;

        myList.add("test");
        outputArrayList = myList.isEmpty();
        assertEquals(outputArrayList,expected);
    }

    @Test
    public void sizeTest()
    {
        int expectedSize = 2;
        int outputSize;
        List myList = new ArrayList(3);
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
        List myList = new ArrayList(3);
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
        expected = "two";
        myReturnObject = myList.get(2);
        output = myReturnObject.getReturnValue();
        assertEquals(output, expected);

    }

    @Test
    public void addEndListTest()
    {
        //test null object insertion scenario

        ReturnObject myReturnObject = new ReturnObjectImpl();
        Object expected = ErrorMessage.INVALID_ARGUMENT;
        Object output;
        List myList = new ArrayList(3);
        myList.add("test");
        myReturnObject = myList.add(null);
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test legitimate item scenario

        expected = ErrorMessage.NO_ERROR;
        myReturnObject = myList.add("test");
        output = myReturnObject.getError();
        assertEquals(output, expected);

        //test boundary case when more items than original length on the list added

        List myShortList = new ArrayList(2);
        myShortList.add("test");
        myShortList.add("test");
        myReturnObject = myShortList.add("test");
        output = myReturnObject.getError();
        assertEquals(output, expected);

    }

    @Test
    public void addTest()
    {


        ReturnObject myReturnObject = new ReturnObjectImpl();

        //test null object insertion scenario
        List myList = new ArrayList(3);
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


    
}
