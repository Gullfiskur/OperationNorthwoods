import java.util.ArrayList;
//  @ Project : Operation Northwoods
//  @ File Name : TicTacToe.java
//  @ Date : 25.11.2012
//  @ Author :


public final class TicTacToe {
    public ArrayList<Box> Board = new ArrayList<Box>();
    public int NrOfGames;
 
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

    }

    public void main() {
        System.out.println("Welcome to TicTacToe");
        TicTacToe newgame = new TicTacToe();
        newgame.playTicTacToe();
        System.out.println("Thanks for playing TicTacToe " + newgame.NrOfGames + " times!");
    }
}
