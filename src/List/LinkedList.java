package List;

import Support.ErrorMessage;
import Support.ObjectNode;
import Support.ReturnObject;
import Support.ReturnObjectImpl;

public class LinkedList implements List
{
    private ObjectNode myFirstObject;
    private int size;
    public LinkedList()
    {
        myFirstObject=null;
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
        return size;
    }
    public ReturnObject get(int index)
    {
        ReturnObjectImpl myResultObject = new ReturnObjectImpl();
        if(index>size-1)
        {
            myResultObject.setErrorMessage(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        else
        {
            for (int i = 0; i == 0; i++)
            {
                //iterate until get to correct node
            }
        }
        return myResultObject;
    }
    public ReturnObject remove(int index)
    {
        if(myFirstObject!=null)
        {
            size=size--;
        }
        ReturnObject myObject = new ReturnObjectImpl();

        return myObject;
    }
    public ReturnObject add(int index, Object item)
    {
        size = size++;

        ReturnObject myObject = new ReturnObjectImpl();

        return myObject;
    }
    public ReturnObject add(Object item)
    {
     ObjectNode newObject = new ObjectNode(item);
        size = size++;

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

        ReturnObject myObject = new ReturnObjectImpl();
        return myObject;
    }

}
