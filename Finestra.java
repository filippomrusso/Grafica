import javax.swing.*;
import java.awt.*;

public class Finestra {

    public static void main(String[] args) {


        int width = 700;
        int height = 500;

        JFrame f = new JFrame();

        Cerchio c = new Cerchio(100,150);
        //Rettangolo r = new Rettangolo(100, 150);

        f.add(c);


        f.setSize(width, height);

        f.setTitle("Grafica");



        f.add(r);



        //Operazione eseguita nel momento del click sulla x e titolo finestra
        f.setDefaultCloseOperation(3);




        //Rende visibile la finestra all utente
        f.setVisible(true);




    }

}
