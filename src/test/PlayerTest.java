import junit.framework.TestCase;
import org.junit.Test;

public class PlayerTest extends TestCase{
    @Test
    public void testPlayer() throws Exception {
        Player test = new Player();
        assertEquals(test, test); //Object,Object
    }

    @Test
    public void testSetName() throws Exception {
        Player test = new Player();
        test.setName("Gaui");
        assertEquals(test.getName(), "Gaui");
    }

    @Test
    public void testGetName() throws Exception {
        Player test = new Player();
        assertEquals(test.setName("Gaui"), test.getName());
    }

    @Test
    public void testChangeTurn() throws Exception { //tests isTurn too
        Player test = new Player();
        if (test.isTurn() == false){
            test.changeTurn();
            assertEquals(test.isTurn(), true);
        }
        if (test.isTurn() == true){
            test.changeTurn();
            assertEquals(test.isTurn(), false);
        }
    }

    @Test
    public void testDebug() throws Exception {
        /*
        mockPlayer.debug();
        replay(mockPlayer);
        Player.debug();
        verify(mockPlayer); */
    }
}
 /*   @Test
    public void TestSetName(){
        //expect(mockPlayer.setName("Joi")).andReturn(mockPlayer.getName());
        assertEquals(mockPlayer.getName(), "Joi");
    }
    @Test
    public String TestGetName(){
        mockPlayer.setName("Gaui");
        assertEquals("Gaui", mockPlayer.getName());
        return "";
    }
    @Test
    public void changeTurn() {
        if (mockPlayer.isTurn() == false){
            mockPlayer.changeTurn();
            assertEquals(mockPlayer.isTurn(), true);
        }
        if (mockPlayer.isTurn() == true){
            mockPlayer.changeTurn();
            assertEquals(mockPlayer.isTurn(), false);
        }
    }
    @Test
    public void debug(){
        mockPlayer.debug();
        replay(mockPlayer);
        Player.debug();
        verify(mockPlayer);
    }

}    */