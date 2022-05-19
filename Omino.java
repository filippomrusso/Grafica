
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

    public void paintOmino(Graphics g){

        Graphics2D g2d = (Graphics2D) g;


        Rectangle2D.Double f = new Rectangle2D.Double(x,y,40,15);                 //Scarpa sx
        g2d.setColor(new Color(255, 255, 255));
        parti_omino[1] = new Rectangle2D.Double(x+60,y,40,15);          //Scarpa dx



        parti_omino[2] = new Rectangle2D.Double(x+20,y-15,20,70);   //Gamba sx
        parti_omino[3] = new Rectangle2D.Double(x+60,y-15,20,70);   //Gamba dx

        //g2d.setColor(new Color(217, 157, 180));
        g2d.fill(f);
        //Rendering di tutti gli elementi
       /*for(int i=0; i<parti_omino.length; i++){
            g2d.fill(parti_omino[i]);
        }*/
    }


}
