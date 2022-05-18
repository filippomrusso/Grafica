import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Poligoni extends JComponent {

    private int altezza;
    private int larghezza;
    private Nuvole nuvole,altre_nuvole, altre_ancora;



    public Poligoni(int _larghezza,int _altezza){

        altezza = _altezza;
        larghezza = _larghezza;
        nuvole = new Nuvole( 50,80,90);
        altre_nuvole = new Nuvole( 320,80,60);
        altre_ancora = new Nuvole( 620,90,80);

    }

    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;


        Rectangle2D.Double r = new Rectangle2D.Double(0,0,larghezza,altezza);
        g2d.setColor(new Color( 135, 206, 235));
        g2d.fill(r);

        g2d.setRenderingHints(antiAliasing());

        Rectangle2D.Double terreno = new Rectangle2D.Double(0,altezza-90,larghezza,60);
        g2d.setColor(new Color(72, 194, 13));
        g2d.fill(terreno);

        //Ellipse2D.Double e = new Ellipse2D.Double(70,75,100,150);
        //g2d.setColor(new Color(24, 255, 246));
        //g2d.fill(e);

        nuvole.paintR(g2d);
        altre_nuvole.paintR(g2d);
        altre_ancora.paintR(g2d);




    }

    protected RenderingHints antiAliasing(){
        RenderingHints antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        return antialiasing;
    }


}
