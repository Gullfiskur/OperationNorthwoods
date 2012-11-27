/*import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(Player.class)
public class PlayerTest_old extends TestCase {
//    PowerMock.expectNew(Player.class).andReturn(mockObject);
//    MockControl control = MockControl.createControl()
//    private Player testPlayer = new Player();
//    private Player expectedPlayer = new Player();
//    Player mockPlayer = EasyMock.createMock(Player.class);
//    //EasyMock.replay(mockPlayer);
//    }
//    //testPlayer.setName("Joi");
//    //EasyMock.expect(mockPlayer.getName("Jonni"));
//    //mockPlayer.setName("Joi");
    Player mockPlayer = new Player();

    @Before
    public void setUp() throws Exception{
        Player mockPlayer = new Player();
        mockPlayer.setName("Joi");
        mockPlayer.changeTurn();
    }
    @Test
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
}   */