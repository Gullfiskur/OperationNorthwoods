/**
 * Created with IntelliJ IDEA.
 * User: Notandi
 * Date: 25.11.2012
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */

public class Player {
    public int nrOfMoves = 0;
    public boolean isTurn = false;
    private String name = "A";

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

    public static void debug() {
        System.out.println("Debug");
        Player.debug();
    }
}