
public class ArrayList implements List
{
    private Object [] myArrayList;
    /**
     * size is introduced as a field to keep track of size of ArrayList with size being number of non null items in the list
     * rather than length of ArrayList. It also allows to make implementation of size() method more efficient removing any
     * need to loop through ArrayList until first null is encountered in order to discover the size of ArrayList
     */
    private int size=0;

    /**
     * ArrayList minimum length is 10. If length of the list needs to exceed 10, list will double each time list boundary
     * is reached
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
        if(isEmpty())
        {
            myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
        }
        else if(index>size-1||index <0)
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
        ReturnObject myObject = new ReturnObjectImpl();

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
