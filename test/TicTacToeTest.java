//package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
* Created with IntelliJ IDEA.
* User: Notandi
* Date: 27.11.2012
* Time: 01:32
* To change this template use File | Settings | File Templates.
*/
public class TicTacToeTest {
    @Test
    public void testPlayTicTacToe() throws Exception {
        TicTacToe testgame = new TicTacToe();
        int i = 0;
        while (i < 10){
            //testgame.x = StdRandom.uniform(0.2, 0.8);
            //testgame.y = StdRandom.uniform(0.2, 0.8);
            testgame.testing = true;
            testgame.playTicTacToe();
            i++;
        }
    }

    @Test
    public void testPrepairPlayers() throws Exception {
        TicTacToe testgame = new TicTacToe();
        testgame.prepairPlayers();

        assertTrue(testgame.P1.isTurn);
        assertTrue(!testgame.P2.isTurn);
        assertTrue(!testgame.P1.won);
        assertTrue(!testgame.P2.won);
        assertTrue(testgame.P1.getName() == "Player One");
        assertTrue(testgame.P2.getName() == "Player Two");
    }

    @Test
    public void testCheckWin() throws Exception {    //checks Box setMarker and prepairPlayers  too
        TicTacToe testgame = new TicTacToe();
        testgame.testing = true;
        Marker testMarker1 = new Marker();
        testMarker1.Marker = 1;
        Marker testMarker2 = new Marker();
        testMarker2.Marker = 2;

        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player One wins
        testgame.Board[0].setMarker(testMarker1);
        testgame.Board[4].setMarker(testMarker1);
        testgame.Board[8].setMarker(testMarker1);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P1.won == true);
        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player One wins
        testgame.Board[1].setMarker(testMarker1);
        testgame.Board[4].setMarker(testMarker1);
        testgame.Board[7].setMarker(testMarker1);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P1.won == true);
        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player One wins
        testgame.Board[6].setMarker(testMarker1);
        testgame.Board[7].setMarker(testMarker1);
        testgame.Board[8].setMarker(testMarker1);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P1.won == true);
        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player Two wins
        testgame.Board[0].setMarker(testMarker2);
        testgame.Board[4].setMarker(testMarker2);
        testgame.Board[8].setMarker(testMarker2);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P2.won == true);
        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player Two wins
        testgame.Board[1].setMarker(testMarker2);
        testgame.Board[4].setMarker(testMarker2);
        testgame.Board[7].setMarker(testMarker2);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P2.won == true);
        testgame.prepairPlayers();
        testgame.prepairBoard();
        //Player Two wins
        testgame.Board[6].setMarker(testMarker2);
        testgame.Board[7].setMarker(testMarker2);
        testgame.Board[8].setMarker(testMarker2);
        testgame.checkWin(testgame.P1, testgame.P2, testgame.Board);
        assertTrue(testgame.P2.won == true);
    }

    @Test
    public void testSwitchPl() throws Exception {

    }
}
