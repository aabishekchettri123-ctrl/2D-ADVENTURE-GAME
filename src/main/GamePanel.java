package main;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class GamePanel extends JPanel implements Runnable{

    final int originaltilesize=17;
    final int scale=3;
    final int tilesize=scale*originaltilesize;

    final int maxcolumns=16;
    final int maxrows=12;

    final int maxheight=maxrows*tilesize;
    final int maxwidth=maxcolumns*tilesize;

    Thread gamethread;
 
    public GamePanel()
    {
        this.setPreferredSize(new DimensionUIResource(maxwidth,maxheight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        
    }



    public void StratThread()
    {
        gamethread= new Thread(this);
        gamethread.start();
    }

    @Override
    public void run() {

        while(gamethread!=null)
        {
            System.out.println("game loop is running");
        }
      

    }

}
