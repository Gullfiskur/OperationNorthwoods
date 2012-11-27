
public class Player {
    public int nrOfMoves = 0;
    public boolean isTurn = false;
    private String name = "A";
    public boolean won = false;

    //Default constructor
    public void Player(String name, boolean turn){
        this.name = name;
        this.isTurn = turn;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }
    public String getName(){
        return this.name;
    }
    public void changeTurn() {
        if (this.isTurn == false)
            this.isTurn = true;
        else this.isTurn = false;
    }
    public boolean isTurn(boolean turn){
        this.isTurn = turn;
        return isTurn;
    }

    /*public static void debug() {
        System.out.println("Debug");
        Player.debug();
    }*/
}