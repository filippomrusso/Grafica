import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Cerchio extends JComponent {

    private int altezza;
    private int larghezza;



    public Cerchio(int _larghezza,int _altezza ){

        altezza = _altezza;
        larghezza = _larghezza;

    }

    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double e = new Ellipse2D.Double(70,75,larghezza,altezza);
        g2d.setColor(new Color(255, 5, 0));
        g2d.fill(e);

    }


}
