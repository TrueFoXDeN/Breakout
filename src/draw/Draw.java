package draw;

import game.GM;
import gui.Gui;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        g.setColor(new Color(38, 38, 38));
        g.fillRect(0,0, Gui.width,Gui.height);

        //Draw Player
        g.setColor(Color.WHITE);
        g.fillRect(GM.p.getX(),GM.p.getY(),GM.p.getWidth(),GM.p.getHeight());

        g.setColor(Color.BLACK);
        g.drawRect(GM.p.getX(),GM.p.getY(),GM.p.getWidth(),GM.p.getHeight());

        repaint();
    }

}
