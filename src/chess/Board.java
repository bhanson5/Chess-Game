
package chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;


public class Board extends JPanel {
    
    public int turn;
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D image = (Graphics2D) g;
	image.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        image.setColor(Color.black);
       
        image.fillRect(0, 0, getWidth(), getHeight());
       
        image.setColor(Color.orange);       
        image.fillRect(0, 0, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect((getWidth() / 8) * 2, 0, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 4, 0, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 6, 0, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect((getWidth() / 8),    (getHeight() / 8), (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 3, (getHeight() / 8), (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 5, (getHeight() / 8), (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 7, (getHeight() / 8), (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect(0, (getHeight() / 8)* 2, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 2, (getHeight() / 8)* 2, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 4, (getHeight() / 8)* 2, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 6, (getHeight() / 8)* 2, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect((getWidth() / 8),    (getHeight() / 8) * 3, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 3, (getHeight() / 8) * 3, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 5, (getHeight() / 8) * 3, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 7, (getHeight() / 8) * 3, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect(0, (getHeight() / 8)* 4, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 2, (getHeight() / 8)* 4, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 4, (getHeight() / 8)* 4, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 6, (getHeight() / 8)* 4, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect((getWidth() / 8),    (getHeight() / 8) * 5, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 3, (getHeight() / 8) * 5, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 5, (getHeight() / 8) * 5, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 7, (getHeight() / 8) * 5, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect(0, (getHeight() / 8)* 6, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 2, (getHeight() / 8)* 6, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 4, (getHeight() / 8)* 6, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8) * 6, (getHeight() / 8)* 6, (getWidth() / 8), (getHeight() / 8));
        
        image.fillRect((getWidth() / 8),    (getHeight() / 8) * 7, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 3, (getHeight() / 8) * 7, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 5, (getHeight() / 8) * 7, (getWidth() / 8), (getHeight() / 8));
        image.fillRect((getWidth() / 8)* 7, (getHeight() / 8) * 7, (getWidth() / 8), (getHeight() / 8));
        
        
        
        
}
    
    
}
