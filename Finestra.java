import javax.swing.*;
import java.awt.*;

public class Finestra {

    public static void main(String[] args) {


        int width = 900;
        int height = 600;

        JFrame f = new JFrame();

        Poligoni c = new Poligoni(width,height);

        f.add(c);

        f.setSize(width, height);

        f.setTitle("Grafica");




        //Operazione eseguita nel momento del click sulla x e titolo finestra
        f.setDefaultCloseOperation(3);




        //Rende visibile la finestra all utente
        f.setVisible(true);




    }

}
