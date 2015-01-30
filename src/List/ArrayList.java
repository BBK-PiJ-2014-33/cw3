package List;
import Support.ErrorMessage;
import Support.ReturnObject;
import Support.ReturnObjectImpl;

public class ArrayList implements List
{
    private Object [] myArrayList;

    /**
     * items field is introduced to keep track of non null items in the list.
     * It allows to make implementation of size()method more efficient
     * removing any need to loop through ArrayList until first null is encountered
     * in order to discover the size of ArrayList
     */

    private int items;

    /**
     * List is initialised to the size suggested by user. Once size reaches originally initialised it will be
     * extended by doubling each time list is full
     */

    public ArrayList(int initialSize)
    {
        myArrayList = new Object[initialSize];
        items = 0;
    }

    public boolean isEmpty()
    {
        if(items==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int size()
    {
        return items;
    }

    public ReturnObject get(int index)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();

        if (validateIndex(index,myObject))
        {
            myObject.setMyObject(myArrayList[index]);
        }
        return myObject;
    }

    /**
     * Method to validate that index provided to update ArrayList is valid
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     * @param index the position at which ArrayList is to be updated
     * @param myObject ReturnObjectImpl that will record error message if index is not valid
     * @return true if index is valid and false otherwise
     */
    private boolean validateIndex(int index, ReturnObjectImpl myObject)
    {
        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
            return false;
        }
        else if(index>items-1||index <0)
        {
            myObject.setErrorMessage(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            return false;
        }
        else
        {
            return true;
        }
    }

    public ReturnObject remove(int index)
    {
        ReturnObject myObject = new ReturnObjectImpl();
        myObject = get(index);
        for( int i = index; i<=items-1; i++)
        {
            move(index+1,index);
        }
        myArrayList[items-1] = null;
        items--;
        return myObject;
    }
    public ReturnObject add(int index, Object item)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();
        //validateIndex(index,myObject);

        items++;
        return myObject;
    }
    public ReturnObject add(Object item)
    {
        ReturnObject myObject = new ReturnObjectImpl();

        items++;
        return myObject;
    }
    private void move(int from, int to)
    {
        myArrayList[to] = myArrayList[from];
    }

}
