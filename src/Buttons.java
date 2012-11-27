import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Buttons extends JFrame implements ActionListener{

public boolean retry;

    public Buttons(){
        //setSize(300,400);
        Frame frame = new Frame("Gaman");
        JButton playagain = new JButton("Play Again");
        playagain.setActionCommand("play");
        frame.add(playagain);
        JButton cancel = new JButton("Cancel");
        cancel.setActionCommand("stop");
        frame.add(cancel);
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 100);
        frame.setVisible(true);
        cancel.addActionListener(this);
        playagain.addActionListener(this);
        //add(startButton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setVisible(true);
        System.out.println("hallo");

    }
    public boolean playAgain(ActionEvent a){
        if ("play".equals(a.getActionCommand()))  {
            System.out.println(a.getActionCommand());
            return true;

        }
        else
            System.out.println("Cancel");
            return false;
    }

    public void  actionPerformed(ActionEvent a) {
           if ("play".equals(a.getActionCommand()))  {
             this.retry = true;

               System.out.println(a.getActionCommand());
               return;

           }
           else
              // System.out.println("Cancel");
               this.retry = false;


        }
    }
