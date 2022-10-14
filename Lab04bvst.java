// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50,50,200,200);
        g.drawRect(125,125,200,200);
        g.drawLine(50,50, 125,125);
        g.drawLine(50,250,125,325);
        g.drawLine(250,50,325,125);
        g.drawLine(250,250,325,325);

        // DRAW SPHERE
        int x = 512;
        int y = 12;
        g.drawOval(600 - x,100 - y, 200, 200);

        g.drawOval(600 - x,125 - y, 200, 150);
        g.drawOval(600 - x,150 - y, 200, 100);
        g.drawOval(600 - x,175 - y, 200, 50);

        g.drawOval(625 - x,100 - y,150,200);
        g.drawOval(650 - x,100 - y,100,200);
        g.drawOval(675 - x,100 - y,50,200);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(700,400,200,200);
        g.drawLine(700,500,800 + 71,500 - 71);
        g.drawLine(800,600,800 + 71,500 - 71);
        g.drawLine(700,500,800,600);
        g.drawOval(736,468,95,95);

        // DRAW APCS

        g.fillRect(75,475,25,125);
        g.fillRect(125,475,25,125);
        g.fillRect(100,475,25,25);
        g.fillRect(100,525,25,25);

        g.fillRect(175,475,25,125);
        g.fillRect(225,475,25,75);
        g.fillRect(200,475,25,25);
        g.fillRect(200,525,25,25);

        g.fillRect(275,475,25,125);
        g.fillRect(300,475,50,25);
        g.fillRect(300,575,50,25);

        g.fillRect(375,475,25,75);
        g.fillRect(400,475,50,25);
        g.fillRect(400,525,25,25);
        g.fillRect(425,525,25,75);
        g.fillRect(375,575,50,25);

        // DRAW PACMEN FLOWER

        g.fillArc(475,350,75,75,225,270);
        g.fillArc(525,300,75,75,135,275);
        g.fillArc(575,350,75,75,45,270);
        g.fillArc(525,400,75,75,315,270);



    }

}


