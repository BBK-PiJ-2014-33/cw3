package List;

import Support.ErrorMessage;
import Support.ReturnObject;
import Support.ReturnObjectImpl;

public class ArrayList implements List
{
    private Object [] myArrayList;
    /**
     * size is introduced as a field to keep track of size of List.List.ArrayList with size being number of non null items in the list
     * rather than length of List.List.ArrayList. It also allows to make implementation of size() method more efficient removing any
     * need to loop through List.List.ArrayList until first null is encountered in order to discover the size of List.List.ArrayList
     */
    private int size=0;

    /**
     * List.List.ArrayList minimum length is 10. If length of the list needs to exceed 10, list will double each time list is full
     */
    public ArrayList()
    {
        myArrayList = new Object[10];
    }

    public boolean isEmpty()
    {
        if(this.size()==0)
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
        return size;
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
     * Method to validate that index provided to update List.List.ArrayList is valid
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     * @param index the position at which List.List.ArrayList is to be updated
     * @param myObject Support.ReturnObjectImpl that will record error message if index is not valid
     * @return true if index is valid and false otherwise
     */
    private boolean validateIndex(int index, ReturnObjectImpl myObject)
    {
        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
            return false;
        }
        else if(index>size-1||index <0)
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
        for( int i = index; i<=size-1; i++)
        {
            move(index+1,index);
        }
        myArrayList[size-1] = null;
        size--;
        return myObject;
    }
    public ReturnObject add(int index, Object item)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();
        //validateIndex(index,myObject);

        size++;
        return myObject;
    }
    public ReturnObject add(Object item)
    {
        ReturnObject myObject = new ReturnObjectImpl();

        size++;
        return myObject;
    }
    private void move(int from, int to)
    {
        myArrayList[to] = myArrayList[from];
    }

}
