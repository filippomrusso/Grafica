import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Nuvole extends JComponent {

    private int x;
    private int y;
    private int dimensioni;


    public Nuvole(int _x,int _y, int _dimensioni){

        x = _x;
        y = _y;
        dimensioni = _dimensioni;

    }


    public void paintR(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHints(antiAliasing());

        Ellipse2D.Double[] cerchi = new Ellipse2D.Double[5];

        cerchi[0] = new Ellipse2D.Double(x,y,dimensioni,dimensioni*1.1);
        cerchi[1] = new Ellipse2D.Double(x+20,y-20,dimensioni*1.1,dimensioni*1.3);
        cerchi[2] = new Ellipse2D.Double(x+40,y+20,dimensioni*1.2,dimensioni*1.4);
        cerchi[3] = new Ellipse2D.Double(x+60,y,dimensioni*1.3,dimensioni*1.5);
        cerchi[4] = new Ellipse2D.Double(x+80,y,dimensioni*1.4,dimensioni*1.6);

        g2d.setColor(new Color(255, 255, 255));

        for (int i=0; i< cerchi.length; i++){
            g2d.fill(cerchi[i]);
        }





    }

    protected RenderingHints antiAliasing(){
        RenderingHints antialiasing = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        return antialiasing;
    }



}
