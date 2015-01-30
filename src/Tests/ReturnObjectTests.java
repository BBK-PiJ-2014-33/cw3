package Tests;
import Support.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ReturnObjectTests {
    @Test
    public void myReturnObjectTest()
    {
        ReturnObjectImpl myObject = new ReturnObjectImpl();

        //test hasError method

        /**
         * ReturnObject defaults to no error
         * expect test to return false result
         */
        boolean expected = false;
        boolean output = myObject.hasError();
        assertEquals(output, expected);

        /**
         * set ReturnObject to contain error
         * expect test to return true result
         */
        myObject.setErrorMessage(ErrorMessage.EMPTY_STRUCTURE);
        expected = true;
        output = myObject.hasError();
        assertEquals(output, expected);

        //test getError method



    }
}
