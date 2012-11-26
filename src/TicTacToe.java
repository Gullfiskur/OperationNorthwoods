import java.util.ArrayList;

public final class TicTacToe {

    public ArrayList<Box> Board = new ArrayList<Box>();
    int NrOfGames = 0;
    public String Playmore = "Y";
 
    public void playTicTacToe() {
        //The main function
        createPlayers();
        prepairBoard();
        GaUI GUI = new GaUI();
        GUI.drawFrame(256,256);
    }

    private void prepairBoard() {
        int i = 0;
        while (i < 9){
            Box theBox = new Box();
            Board.add(theBox);
            i++;
        }
    }

    public void createPlayers() {
        Player P1 = new Player();
        Player P2 = new Player();
        P1.setName("Player One");
        P2.setName("Player Two");
        P1.isTurn = true;
        P2.isTurn = false;
    }

    public int checkWin() {
              return 0;
    }

    public void switchPl(Player P1, Player P2) {
        P1.changeTurn();
        P2.changeTurn();
    }

    public void main() {
        System.out.println("Welcome to TicTacToe");
        TicTacToe newgame = new TicTacToe();
        newgame.playTicTacToe();
        System.out.println("Thanks for playing TicTacToe " + newgame.NrOfGames + " times!");
    }
}
