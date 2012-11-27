import java.awt.*;

public class GaUI {
    public void drawMarker(Box X) {
 
    }
    public void DrawFrame(int X, int Y) {
        StdDraw.setCanvasSize(Y, X);
        //RectHV Frame = new RectHV(0.0,0.0,1.0,1.0);
        //StdDraw.setPenColor(StdDraw.DARK_GRAY);
        //StdDraw.setPenColor(new Color(.5f,.5f,.5f));
        //StdDraw.setPenRadius(1024);
        //Frame.draw();
        StdDraw.clear(StdDraw.DARK_GRAY);
        StdDraw.show();
    }
    public void DrawCanvas(){
        StdDraw.setPenRadius(.015);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.square(.2, .2, .15);
        StdDraw.square(.5, .2, .15);
        StdDraw.square(.8, .2, .15);
        StdDraw.square(.2, .5, .15);
        StdDraw.square(.5, .5, .15);
        StdDraw.square(.8, .5, .15);
        StdDraw.square(.2, .8, .15);
        StdDraw.square(.5, .8, .15);
        StdDraw.square(.8, .8, .15);
        StdDraw.setPenRadius(.03);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.square(.5, .5, .45);
        StdDraw.show();
    }
    public void makeMoveMouse(double x, double y, Player P1, Box[] board) {

        Marker mP1 = new Marker();
        mP1.Marker = 1;
        Marker mP2 = new Marker();
        mP2.Marker = 2;

        Point2D mouseXY = new Point2D(x,y);

        double fix = .15; //for the size
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(new Color(.79f,.99f,.79f));
        RectHV Frame1 = new RectHV(0.2-fix,0.2-fix,0.2+fix,0.2+fix);
        if (Frame1.contains(mouseXY)){if (P1.isTurn == true){board[0].place(mP1);} else {board[0].place(mP2);}}
        RectHV Frame2 = new RectHV(0.5-fix,0.2-fix,0.5+fix,0.2+fix);
        if (Frame2.contains(mouseXY)){if (P1.isTurn == true){board[1].place(mP1);} else {board[1].place(mP2);}}
        RectHV Frame3 = new RectHV(0.8-fix,0.2-fix,0.8+fix,0.2+fix);
        if (Frame3.contains(mouseXY)){if (P1.isTurn == true){board[2].place(mP1);} else {board[2].place(mP2);}}
        RectHV Frame4 = new RectHV(0.2-fix,0.5-fix,0.2+fix,0.5+fix);
        if (Frame4.contains(mouseXY)){if (P1.isTurn == true){board[3].place(mP1);} else {board[3].place(mP2);}}
        RectHV Frame5 = new RectHV(0.5-fix,0.5-fix,0.5+fix,0.5+fix);
        if (Frame5.contains(mouseXY)){if (P1.isTurn == true){board[4].place(mP1);} else {board[4].place(mP2);}}
        RectHV Frame6 = new RectHV(0.8-fix,0.5-fix,0.8+fix,0.5+fix);
        if (Frame6.contains(mouseXY)){if (P1.isTurn == true){board[5].place(mP1);} else {board[5].place(mP2);}}
        RectHV Frame7 = new RectHV(0.2-fix,0.8-fix,0.2+fix,0.8+fix);
        if (Frame7.contains(mouseXY)){if (P1.isTurn == true){board[6].place(mP1);} else {board[6].place(mP2);}}
        RectHV Frame8 = new RectHV(0.5-fix,0.8-fix,0.5+fix,0.8+fix);
        if (Frame8.contains(mouseXY)){if (P1.isTurn == true){board[7].place(mP1);} else {board[7].place(mP2);}}
        RectHV Frame9 = new RectHV(0.8-fix,0.8-fix,0.8+fix,0.8+fix);
        if (Frame9.contains(mouseXY)){if (P1.isTurn == true){board[8].place(mP1);} else {board[8].place(mP2);}}
        /*Frame1.draw();
        Frame2.draw();
        Frame3.draw();
        Frame4.draw();
        Frame5.draw();
        Frame6.draw();
        Frame7.draw();
        Frame8.draw();
        Frame9.draw();*/
        StdDraw.show();
        StdDraw.show(200);
    }
    public void DrawToBoard(Box[] board){
        double fix1 = 0.01;
        double fix = 0.035;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setFont(new Font("Arial", Font.BOLD, 55));
        if (board[0].getMarker() == 1)
            StdDraw.text(.20-fix1, .20-fix, "X");
        if (board[1].getMarker() == 1)
            StdDraw.text(.50-fix1, .20-fix, "X");
        if (board[2].getMarker() == 1)
            StdDraw.text(.80-fix1, .20-fix, "X");
        if (board[3].getMarker() == 1)
            StdDraw.text(.20-fix1, .50-fix, "X");
        if (board[4].getMarker() == 1)
            StdDraw.text(.50-fix1, .50-fix, "X");
        if (board[5].getMarker() == 1)
            StdDraw.text(.80-fix1, .50-fix, "X");
        if (board[6].getMarker() == 1)
            StdDraw.text(.20-fix1, .80-fix, "X");
        if (board[7].getMarker() == 1)
            StdDraw.text(.50-fix1, .80-fix, "X");
        if (board[8].getMarker() == 1)
            StdDraw.text(.80-fix1, .80-fix, "X");
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setFont(new Font("Arial", Font.BOLD, 55));
        if (board[0].getMarker() == 2)
            StdDraw.text(.20-fix1, .20-fix, "O");
        if (board[1].getMarker() == 2)
            StdDraw.text(.50-fix1, .20-fix, "O");
        if (board[2].getMarker() == 2)
            StdDraw.text(.80-fix1, .20-fix, "O");
        if (board[3].getMarker() == 2)
            StdDraw.text(.20-fix1, .50-fix, "O");
        if (board[4].getMarker() == 2)
            StdDraw.text(.50-fix1, .50-fix, "O");
        if (board[5].getMarker() == 2)
            StdDraw.text(.80-fix1, .50-fix, "O");
        if (board[6].getMarker() == 2)
            StdDraw.text(.20-fix1, .80-fix, "O");
        if (board[7].getMarker() == 2)
            StdDraw.text(.50-fix1, .80-fix, "O");
        if (board[8].getMarker() == 2)
            StdDraw.text(.80-fix1, .80-fix, "O");
        StdDraw.show();
    }

    public void resetFrame() {
 
    }
 
    public void mouseListener() {
 
    }
}