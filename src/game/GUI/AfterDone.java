package game.GUI;

import java.awt.*;

public class AfterDone {
    public static void draw(Graphics2D g){
        Font font = g.getFont();
        // Set background color
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0, 0, 800, 800);
        // Draw Title
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.WHITE);
        String title = "Finaly Steven has done it.";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (800 - titleWidth) / 2, 175);

        String startMessage = "He is back home.";
        int textWidth = g.getFontMetrics().stringWidth(startMessage);
        g.drawString(startMessage, (800 - textWidth) / 2, 250);

        String steuerungMessage = "And he couldn't be happier!";
        int textWidth1 = g.getFontMetrics().stringWidth(steuerungMessage);
        g.drawString(steuerungMessage, (800 - textWidth1) / 2, 325);

        String continuer = "Press Space to play again";
        int continueWidth = g.getFontMetrics().stringWidth(continuer);
        g.drawString(continuer,(800 - continueWidth)/2,700);

        g.setFont(font);

    }
}
