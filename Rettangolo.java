import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Rettangolo extends JComponent {

    private int altezza;
    private int larghezza;


    public Rettangolo(int _larghezza,int _altezza ){

        altezza = _altezza;
        larghezza = _larghezza;

    }

    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double e = new Rectangle2D.Double(120,75,larghezza,altezza);
        g2d.setColor(new Color(25, 54, 98));
        g2d.fill(e);

    }



}
