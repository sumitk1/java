package dataStructures;

import java.awt.*;  
import java.awt.font.*;  
import javax.swing.*;  
   
public class DrawingATree extends JPanel {  
    String[][] data = {  
        { "Car" },  
        { "Toyota", "Volkswagen" }  
    };  
    int[][] offsets = { { 0 }, { 25, 25 } };  
    final int PAD = 20;  
   
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        Graphics2D g2 = (Graphics2D)g;  
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,  
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);  
        Font font = g2.getFont();  
        FontRenderContext frc = g2.getFontRenderContext();  
        float y = PAD;  
        for(int j = 0; j < data.length; j++) {  
            for(int k = 0; k < data[j].length; k++) {  
                String s = data[j][k];  
                LineMetrics lm = font.getLineMetrics(s, frc);  
                float x = PAD + offsets[j][k];  
                y += lm.getAscent();  
                g2.drawString(s, x, y);  
                y += lm.getDescent();  
            }  
        }  
    }  
    
/*    public void drawTree(Graphics2D g){
    	for (int i=10;i>=0;i--){//Loops through array that contains an object with the coordinates of each leave in the tree
    	Rectangle r = new Rectangle(coordinates.getX()*50,coordinates.getY()*50,55,20);
    	g.draw(r);
    	g.drawString((String)coordinates.getPos().element(), r.x + 4, r.y + 15);

    	g.drawLine( r.x-10, r.y+50, r.x + r.width/2 , r.y+20);
    	g.drawLine( r.x+70, r.y+50, r.x + r.width/2, r.y+20);
    	}
    }*/
    
    public static void main(String[] args) {  
        JFrame f = new JFrame();  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.getContentPane().add(new DrawingATree());  
        f.setSize(400,400);  
        f.setLocation(200,200);  
        f.setVisible(true);  
        
        
        
    }  
}  