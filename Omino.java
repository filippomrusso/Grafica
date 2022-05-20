
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Omino extends JComponent{

    private int x;
    private int y;
    private Rectangle2D.Double[] parti_omino;


    public Omino (int _x, int _y){
        x = _x;
        y = _y;
        this.parti_omino = new Rectangle2D.Double[5];
    }

    public void paintOmino(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(255, 255, 255));


            Rectangle2D.Double scarpaSx = new Rectangle2D.Double(x, y+55, 40, 11);
            g2d.fill(scarpaSx);

            Rectangle2D.Double scarpaDx = new Rectangle2D.Double(x + 60, y+55, 40, 11);
            g2d.fill(scarpaDx);


        g2d.setColor(new Color(217, 157, 180));



            Rectangle2D.Double gambaSx = new Rectangle2D.Double(x + 30, y - 15, 10, 70);
            g2d.fill(gambaSx);

            Rectangle2D.Double gambaDx = new Rectangle2D.Double(x + 60, y - 15, 10, 70);
            g2d.fill(gambaDx);




    }

}



