package game.framework;


import game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintArea2d extends JPanel {

    private final Game game;

    public PaintArea2d() {
        super();
        game = new Game();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Game.mousePressed = true;
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Game.mousePressed = false;
                super.mouseReleased(e);
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    Game.spacePressed = true;
                }
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    Game.spacePressed = false;
                }
                super.keyReleased(e);
            }
        });

        setFocusable(true);
        requestFocusInWindow();
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        game.update();
        game.draw(g2d);
    }



}
