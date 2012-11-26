public class GaUI {
    public void drawMarker(Box X) {
 
    }
    public void drawFrame(int X, int Y) {
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


    public void resetFrame() {
 
    }
 
    public void mouseListener() {
 
    }
}