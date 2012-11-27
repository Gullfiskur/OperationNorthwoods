public class TicTacToe {

    public Box[] Board = new Box[9];
    int NrOfMoves = 0;                  //used for draw
    public String Playmore = "Y";
    public Player P1 = new Player();
    public Player P2 = new Player();
    public boolean testing = false;     //used for TicTacToeTest
    public double x;
    public double y;

    public void playTicTacToe() {   //The function
        GaUI GUI = new GaUI();
        GUI.DrawFrame(450,450);
        while (true) {
            prepairPlayers();
            prepairBoard();
            GUI.DrawCanvas();
            GUI.DrawToBoard(Board);
            while (!P1.won && !P2.won && NrOfMoves < 9){ //medan enginn er ad vinna eda jafntefli
                if (StdDraw.mousePressed() || testing) {
                    if (!testing){
                    x = StdDraw.mouseX();
                    y = StdDraw.mouseY();}
                    GUI.makeMoveMouse(x,y,P1,Board);
                    switchPl(P1,P2);
                    GUI.DrawToBoard(Board);
                    checkWin(P1,P2,Board);
                    NrOfMoves++;
                }
            }
        }
    }
    public void prepairBoard() {
        int i = 0;
        NrOfMoves = 0;
        //Marker mark = new Marker();
        //Marker.
        while (i < 9){
            Board[i] = new Box();
            //Board[i].setMarker(0);
            i++;
        }
    }
    public void prepairPlayers() {
        P1.setName("Player One");
        P2.setName("Player Two");
        P1.isTurn = true;
        P2.isTurn = false;
        P1.won = false;
        P2.won = false;
    }

    public void checkWin(Player P1, Player P2, Box[] board) {
        if (board[0].getMarker()==1 && board[4].getMarker()==1 && board[8].getMarker()==1)
            P1.won = true;
        if (board[2].getMarker()==1 && board[4].getMarker()==1 && board[6].getMarker()==1)
            P1.won = true;
        if (board[0].getMarker()==1 && board[3].getMarker()==1 && board[6].getMarker()==1)
            P1.won = true;
        if (board[1].getMarker()==1 && board[4].getMarker()==1 && board[7].getMarker()==1)
            P1.won = true;
        if (board[2].getMarker()==1 && board[5].getMarker()==1 && board[8].getMarker()==1)
            P1.won = true;
        if (board[0].getMarker()==1 && board[1].getMarker()==1 && board[2].getMarker()==1)
            P1.won = true;
        if (board[3].getMarker()==1 && board[4].getMarker()==1 && board[5].getMarker()==1)
            P1.won = true;
        if (board[6].getMarker()==1 && board[7].getMarker()==1 && board[8].getMarker()==1)
            P1.won = true;
        if (board[0].getMarker()==2 && board[4].getMarker()==2 && board[8].getMarker()==2)
            P2.won = true;
        if (board[2].getMarker()==2 && board[4].getMarker()==2 && board[6].getMarker()==2)
            P2.won = true;
        if (board[0].getMarker()==2 && board[3].getMarker()==2 && board[6].getMarker()==2)
            P2.won = true;
        if (board[1].getMarker()==2 && board[4].getMarker()==2 && board[7].getMarker()==2)
            P2.won = true;
        if (board[2].getMarker()==2 && board[5].getMarker()==2 && board[8].getMarker()==2)
            P2.won = true;
        if (board[0].getMarker()==2 && board[1].getMarker()==2 && board[2].getMarker()==2)
            P2.won = true;
        if (board[3].getMarker()==2 && board[4].getMarker()==2 && board[5].getMarker()==2)
            P2.won = true;
        if (board[6].getMarker()==2 && board[7].getMarker()==2 && board[8].getMarker()==2)
            P2.won = true;
    }

    public void switchPl(Player P1, Player P2) {
        P1.changeTurn();
        P2.changeTurn();
    }

    public static void main(String[] args) {
        //System.out.println("Welcome to TicTacToe");
        TicTacToe newgame = new TicTacToe();
        newgame.playTicTacToe();
        //System.out.println("Thanks for playing TicTacToe");
    }
}
