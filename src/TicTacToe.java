public class TicTacToe {

    public Box[] Board = new Box[9];
    int NrOfGames = 0;
    public String Playmore = "Y";
    public Player P1 = new Player();
    public Player P2 = new Player();

 
    public void playTicTacToe() {
        //The main function
        while (Playmore != "n" && Playmore != "N") {
            prepairPlayers();
            prepairBoard();
            GaUI GUI = new GaUI();
            GUI.DrawFrame(256,256);
            GUI.DrawCanvas();
            while (!P1.won && !P2.won){ //medan enginn er að vinna
                if (StdDraw.mousePressed()) {
                    double x = StdDraw.mouseX();
                    double y = StdDraw.mouseY();
                    GUI.makeMoveMouse(x,y,P1,Board);
                    switchPl(P1,P2);
                    GUI.DrawToBoard(Board);
                    checkWin();
                }
        }
    }
    }
    private void prepairBoard() {
        int i = 0;
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
    }

    public int checkWin() {
              return 0;
    }

    public void switchPl(Player P1, Player P2) {
        P1.changeTurn();
        P2.changeTurn();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        TicTacToe newgame = new TicTacToe();
        newgame.playTicTacToe();
        System.out.println("Thanks for playing TicTacToe " + newgame.NrOfGames + " times!");
    }
}
