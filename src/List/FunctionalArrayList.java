package List;

import Support.*;

public class FunctionalArrayList extends ArrayList implements FunctionalList
{
    public ReturnObject head()
    {
        ReturnObject myObject = new ReturnObjectImpl();
        myObject = get(0);
        return myObject;
    }

    public FunctionalList rest()
    {
        FunctionalList myFunctionalList = new FunctionalArrayList();
        return myFunctionalList;
    }

}
