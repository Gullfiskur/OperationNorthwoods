import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
* Created with IntelliJ IDEA.
* User: Spalli
* Date: 26.11.2012
* Time: 19:24
* To change this template use File | Settings | File Templates.
*/
public class BoxTest  extends TestCase{
    @Test
    public void testPlace() throws Exception {
        Box boxtest = new Box();
        Marker marktest = new Marker();
        marktest.Marker = 1;

        assertEquals(boxtest.place(marktest),true);

        assertEquals(boxtest.place(marktest),false);



    }
}