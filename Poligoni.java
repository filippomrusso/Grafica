import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Poligoni extends JComponent {

    private int altezza;
    private int larghezza;
    private Nuvole[] nuvole = new Nuvole[5];
    private Omino om;



    public Poligoni(int _larghezza,int _altezza){

        altezza = _altezza;
        larghezza = _larghezza;

        om = new Omino(60,altezza-150);

        /*nuvole[0] = new Nuvole(50,80,90);
        nuvole[1] = new Nuvole(320,80,60);
        nuvole[2] = new Nuvole( 620,90,80);*/
    }

    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHints(antiAliasing());

        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, larghezza, altezza);
        g2d.setColor(new Color(135, 206, 235));
        g2d.fill(r);


        Rectangle2D.Double terreno = new Rectangle2D.Double(0, altezza - 90, larghezza, 60);
        g2d.setColor(new Color(72, 194, 13));
        g2d.fill(terreno);

        /*for (int i = 0; i < nuvole.length; i++) {
            nuvole[i].paintR(g2d);
        }*/

        om.paintOmino(g2d);
    }

    protected RenderingHints antiAliasing(){
        RenderingHints antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        return antialiasing;
    }


}
