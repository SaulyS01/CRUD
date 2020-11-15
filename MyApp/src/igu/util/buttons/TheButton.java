
package igu.util.buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class TheButton extends JButton implements MouseListener {

    private Color colorNormal = new Color(0, 139, 139);
    private Color colorPressed = new Color(0, 0, 0);   
    private Color colorHover = new Color(102, 102, 102); 
    
    @SuppressWarnings("LeakingThisInConstructor")
    public TheButton() {
        this.setContentAreaFilled(false);
        this.setBackground(this.colorNormal);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public void mouseClicked(MouseEvent e) {
    }
    
    public void mousePressed(MouseEvent e) {
        this.setBackground(this.colorPressed);
    }

    public void mouseReleased(MouseEvent e) {       
        this.setBackground(this.colorNormal);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
        this.setBackground(this.colorNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.setBackground(colorNormal);
        this.colorNormal = colorNormal;      
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
    }
    

    public void setColorTextHover(Color color) {
        
    }

    public void setColorTextPressed(Color color) {
    }
}
    
    
