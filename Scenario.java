import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Scenario extends JComponent {

    private int altezza;
    private int larghezza;
    private Nuvole[] nuvole = new Nuvole[5];
    private Omino om;



    public Scenario(int _larghezza,int _altezza){

        altezza = _altezza;
        larghezza = _larghezza;

        om = new Omino(60,altezza-150);


    }

    protected void paintComponent(Graphics g) {

        Nuvole n1 = new Nuvole(50,80,90);
        Nuvole n2 = new Nuvole(320,80,60);
        Nuvole n3 = new Nuvole( 620,90,80);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHints(antiAliasing());

        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, larghezza, altezza);
        g2d.setColor(new Color(135, 206, 235));
        g2d.fill(r);


        Rectangle2D.Double terreno = new Rectangle2D.Double(0, altezza - 90, larghezza, 60);
        g2d.setColor(new Color(72, 194, 13));
        g2d.fill(terreno);

        n1.paintR(g2d);
        n2.paintR(g2d);
        n3.paintR(g2d);

        om.paintOmino(g2d);
    }

    protected RenderingHints antiAliasing(){
        RenderingHints antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        return antialiasing;
    }


}
