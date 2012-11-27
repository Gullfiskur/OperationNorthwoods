import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Buttons extends JFrame implements ActionListener{

    public Buttons(){
        //setSize(300,400);
        Frame frame = new Frame("Gaman");
        JButton playagain = new JButton("Play Again");
        frame.add(playagain);
        JButton cancel = new JButton("Cancel");
        frame.add(cancel);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 100);
        frame.setVisible(true);
        cancel.addActionListener(this);
        playagain.addActionListener(this);
        //add(startButton);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setVisible(true);

    }
    public void  actionPerformed(ActionEvent a) {
           // for(int i = 0; true; i++) {
             //       System.out.println(i);
           // newgame.playTicTacToe();

            }
    }
    public static void main(String[] args){
        new Buttons();
    }
}
