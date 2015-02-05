/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JPanel {


    
    public static void main(String[] args) throws InterruptedException {
        JFrame Window = new JFrame("Chess");
        Board Game = new Board();
        Window.add(Game);
        Window.setSize(300, 300);
        Window.setVisible(true);
        Window.setLocation(150, 150);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
       
    }

   
    

}


    
  
