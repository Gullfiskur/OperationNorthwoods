import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class TestBox extends TestCase {




    @test
    public void testPlace ()
    {
          Box boxtest = new box();
          Marker marktest = new marker();
          marktest.Marker = 1;

          assertEquals(box.place(mark),true);

          assertEquals(box.place(mark),false);


    }

}