package List;
import Support.*;

public class LinkedList implements List
{
    private ObjectNode myFirstObject;
    private int items;
    public LinkedList()
    {
        myFirstObject=null;
        items = 0;
    }
    public boolean isEmpty()
    {
        if (myFirstObject==null)
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

        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
        }
        else if (validateIndex(index,myObject))
        {
            int count = 0;
            ObjectNode myNode = myFirstObject;
            while (count!=index)
            {
                myNode = myNode.getNext();
                count++;
            }
            myObject.setMyObject(myNode.getObject());
        }
        return myObject;
    }

    /**
     * Method to validate that index provided to update List is valid
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error is returned.
     * @param index the position at which List is to be updated
     * @param myObject ReturnObjectImpl that will record error message if index is not valid
     * @return true if index is valid and false otherwise
     */
    private boolean validateIndex(int index, ReturnObjectImpl myObject)
    {

        if(index>items-1||index <0)
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
        ReturnObjectImpl myObject = new ReturnObjectImpl();

        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
        }
        else if (validateIndex(index,myObject))
        {
            int count = 0;
            ObjectNode myNode = myFirstObject;
            while (count!=index)
            {
                myNode = myNode.getNext();
                count++;
            }
            myObject.setMyObject(myNode.getObject());
            if (myNode.getNext()==null)
            {
                //last node in the list
                myNode.setObjectToNull();
            }
            else
            shift(index);
            items--;
        }
        return myObject;
    }

    private void shift(int index)
    {

    }
    public ReturnObject add(int index, Object item)
    {
        items++;

        ReturnObject myObject = new ReturnObjectImpl();

        return myObject;
    }
    public ReturnObject add(Object item)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();

        if (item !=null)
        {
            ObjectNode newObject = new ObjectNode(item);
            if(isEmpty())
            {
                myFirstObject=newObject;
            }
            else
            {
                ObjectNode anotherObject = myFirstObject;
                while(anotherObject.getNext()!=null) {
                    anotherObject = anotherObject.getNext();
                }
                anotherObject.setNext(newObject);
            }
            items++;
        }
        else
        {
            myObject.setErrorMessage(ErrorMessage.INVALID_ARGUMENT);
        }
        return myObject;
    }
}
