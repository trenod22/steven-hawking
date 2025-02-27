package game.framework;

import javax.swing.*;

public class Frame extends JFrame {
    public static final int WINDOWS_WIDTH = 800;
    public static final int WINDOWS_HEIGHT = 800;

    private final PaintArea2d paintArea = new PaintArea2d();

    public Frame(){

        setTitle("Steven Walking");
        setSize(WINDOWS_WIDTH, WINDOWS_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(paintArea);

        Timer timer = new Timer(10, (e) ->
                paintArea.repaint()
        );
        timer.start();
    }

    public static void main(String[] args) {
        System.setProperty("sun.java2d.opengl", "true");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
}
