package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        JFrame window =new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        GamePanel gamepanel =new GamePanel();
        window.add(gamepanel);
        window.pack();

        window.setTitle("2D ADVENTURE GAME");
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        window.setVisible(true);
        
    }

}
