package Tests;
import Support.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ReturnObjectTests {
    @Test
    public void myReturnObjectTest()
    {
        ReturnObject myObject = new ReturnObjectImpl();
        /**
         * New ReturnObject defaults to no error
         * We expect test to return false result
         */
        boolean expected = false;
        boolean output = myObject.hasError();
        assertEquals(output, expected);
    }
}
