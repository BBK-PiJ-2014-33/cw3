package Stack;

import Support.*;
import List.*;

public class ImprovedStackImpl implements ImprovedStack
{
    private Stack myStack;
    public ImprovedStackImpl()
    {
        List myList = new LinkedList();
        myStack = new StackImpl(myList);
    }

    public boolean isEmpty()
    {
        return myStack.isEmpty();
    }

    public int size()
    {
        return myStack.size();
    }

    public void push(Object item)
    {
        myStack.push(item);
    }


    public ReturnObject top()
    {
        return myStack.top();
    }

    public ReturnObject pop()
    {
        return myStack.pop();
    }
    /**
     * Returns a copy of this stack with the items reversed, the top
     * elements on the original stack is at the bottom of the new
     * stack and viceversa.
     *
     * @return a copy of this stack with the items reversed.
     */
    public ImprovedStack reverse()
    {
       ImprovedStack myStack = new ImprovedStackImpl();

        return myStack;

    }

    /**
     * Removes the given object from the stack if it is
     * there. Multiple instances of the object are all removed.
     *
     * Classes implementing this method must use method .equals() to
     * check whether the item is in the stack or not.
     *
     * @param object the object to remove
     */
    public void remove(Object object)
    {

    }
}
