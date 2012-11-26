import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class TestBox extends TestCase {

           //commit


    @Test
    public void testPlace ()
    {
          Box boxtest = new Box()
          Marker marktest = new Marker();
          marktest.Marker = 1;

          assertEquals(box.place(mark),true);

          assertEquals(box.place(mark),false);


    }

}