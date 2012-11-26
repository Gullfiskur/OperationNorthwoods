import java.util.ArrayList;
//  @ Project : Operation Northwoods
//  @ File Name : TicTacToe.java
//  @ Date : 25.11.2012
//  @ Author :


public final class TicTacToe {
    public ArrayList<Box> Board = new ArrayList<Box>();
    public int NrOfGames;
    Player P1 = new Player();
    Player P2= new Player();
 
    public void playTicTacToe() {
        //The main function
        //Board.prepairBoard();
    }
 
    public void createPlayers() {

    }

    public int checkWin() {
              return 0;
    }

    public void switchPl() {
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
