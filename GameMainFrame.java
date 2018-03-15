/*
Catey Meador
GameMainFrame.java
Creates the Jframe and houses GamePanel.java
3/15/18
*/

import javax.swing.JFrame;
 
public class GameMainFrame {
 
        public static void main(String[] args)
        {

        	JFrame myFrame = new JFrame(); 

        	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        	GamePanel mainPanel = new GamePanel();

        	myFrame.add(mainPanel);
 
        	myFrame.pack();
 
        	myFrame.setVisible(true);
               
        }
}