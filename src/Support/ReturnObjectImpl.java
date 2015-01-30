package Support;

public class ReturnObjectImpl implements ReturnObject
{
    private Object myObject = new Object();
    private ErrorMessage myErrorMessage = ErrorMessage.NO_ERROR;

    public boolean hasError()
    {
        if (myErrorMessage == ErrorMessage.NO_ERROR)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public ErrorMessage getError()
    {
        if (!hasError())
        {
            return ErrorMessage.NO_ERROR;
        }
        else
        {
            return myErrorMessage;
        }
    }
    public Object getReturnValue()
    {
        if(hasError())
        {
            return getError();
        }
        else return myObject;
    }
    public void setErrorMessage(ErrorMessage myErrorMessage)
    {
        this.myErrorMessage = myErrorMessage;
    }
    public void setMyObject (Object myObject)
    {
        this.myObject = myObject;
    }
}
