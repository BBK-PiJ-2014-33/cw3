
public class ArrayList implements List
{
    private Object [] myArrayList;

    public boolean isEmpty()
    {
        if(myArrayList.length==0)
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
        return myArrayList.length;
    }

    public ReturnObject get(int index)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();
        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
        }
        else if(index>size()-1)
        {
            myObject.setErrorMessage(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        else
        {
           myObject.setMyObject(myArrayList[index]);
        }

        return myObject;
    }

    public ReturnObject remove(int index)
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();

        if (!get(index).hasError())
        {

        }
        else
        {
            myObject.setErrorMessage(get(index).getError());
        }

        return myObject;
    }
    public ReturnObject add(int index, Object item)
    {
        ReturnObject myObject = new ReturnObjectImpl();

        return myObject;
    }
    public ReturnObject add(Object item)
    {
        ReturnObject myObject = new ReturnObjectImpl();

        return myObject;
    }

}
